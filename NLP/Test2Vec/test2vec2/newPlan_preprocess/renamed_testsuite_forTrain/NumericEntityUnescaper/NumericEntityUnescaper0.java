
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test001");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        java.lang.Class<?> wildcardClass1 = oPTION0.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test002");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test003");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test004");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        java.lang.Class<?> wildcardClass1 = oPTION0.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test005");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", (int) (byte) -1, writer4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test006");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test007");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A", (int) (short) -1, writer4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test008");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test009");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.Class<?> wildcardClass6 = oPTIONArray4.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test010");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test011");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "A", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test012");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test013");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate(charSequence3, writer4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test014");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test015");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test016");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test017");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test018");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.Class<?> wildcardClass4 = numericEntityUnescaper1.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test019");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test020");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass3 = oPTIONArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test021");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test022");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test023");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test024");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "", (int) (byte) 10, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test025");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test026");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test027");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test028");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test029");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test030");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "64", writer4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test031");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0", (int) (byte) 1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test032");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test033");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "64", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test034");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "0", (int) (byte) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test035");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test036");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test037");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test038");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test039");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.Class<?> wildcardClass7 = oPTIONArray4.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test040");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator5.translate((java.lang.CharSequence) "", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test041");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test042");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test043");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "FFFFFFFF");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test044");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "1", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test045");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean9 = numericEntityUnescaper1.isSet(oPTION8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION8 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION8.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test046");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean8 = numericEntityUnescaper6.isSet(oPTION7);
        boolean boolean9 = numericEntityUnescaper2.isSet(oPTION7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray5);
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test047");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        java.lang.Class<?> wildcardClass1 = oPTION0.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test048");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test049");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "0", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test050");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test051");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test052");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0", (int) (byte) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test053");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test054");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str8 = numericEntityUnescaper6.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test055");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test056");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test057");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test058");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test059");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = oPTION6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test060");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test061");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test062");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test063");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test064");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test065");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test066");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "A", (int) 'a', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test067");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "20", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test068");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test069");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test070");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass4 = oPTIONArray2.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test071");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass6 = charSequenceTranslatorArray4.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test072");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", (int) (short) 1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test073");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "23", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test074");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20", (int) (byte) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test075");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test076");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test077");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "1", (int) 'a', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test078");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test079");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
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
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test080");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test081");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass4 = oPTIONArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test082");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61", (int) (byte) 10, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test083");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "0", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test084");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test085");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "A", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test086");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test087");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str8 = numericEntityUnescaper6.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test088");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.Class<?> wildcardClass9 = oPTIONArray4.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test089");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test090");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test091");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test092");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test093");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test094");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "0", (int) (byte) 100, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test095");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "20", (int) (byte) -1, writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test096");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "0", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test097");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = null;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test098");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "", (int) (short) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test099");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test100");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "23", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test101");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test102");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test103");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = null;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test104");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test105");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test106");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test107");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test108");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "34", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test109");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test110");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "23", 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test111");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test112");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass7 = oPTIONArray2.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test113");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass4 = numericEntityUnescaper3.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test114");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test115");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass6 = oPTIONArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test116");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper3.translate(charSequence4, (int) (byte) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test117");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean8 = numericEntityUnescaper6.isSet(oPTION7);
        boolean boolean9 = numericEntityUnescaper1.isSet(oPTION7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test118");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test119");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test120");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "64", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test121");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = oPTION6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test122");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test123");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test124");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "61", 10, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test125");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityUnescaper4.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test126");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "1");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test127");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test128");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test129");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "61", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test130");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test131");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test132");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "20", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test133");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper4.translate(charSequence5, (int) '4', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test134");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34", (int) ' ', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test135");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test136");
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
            numericEntityUnescaper6.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test137");
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
            numericEntityUnescaper4.translate((java.lang.CharSequence) "hi!", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test138");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator5.translate((java.lang.CharSequence) "61", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test139");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper7.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test140");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate(charSequence7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test141");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator5.translate((java.lang.CharSequence) "20", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test142");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean8 = numericEntityUnescaper6.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = oPTION7.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test143");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test144");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean8 = numericEntityUnescaper6.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test145");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "20", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test146");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean8 = numericEntityUnescaper6.isSet(oPTION7);
        boolean boolean9 = numericEntityUnescaper4.isSet(oPTION7);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray5);
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test147");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate(charSequence6, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test148");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "34", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test149");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test150");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass5 = oPTIONArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test151");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass5 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test152");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslator7.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test153");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23", (int) (byte) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test154");
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
            numericEntityUnescaper6.translate((java.lang.CharSequence) "23", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test155");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test156");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test157");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", (int) '4', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test158");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test159");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "34", (int) (byte) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test160");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test161");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test162");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test163");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test164");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "20", (int) (short) -1, writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test165");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass9 = oPTIONArray2.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test166");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper1.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test167");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test168");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61", (-1), writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test169");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test170");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test171");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test172");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test173");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper4.with(charSequenceTranslatorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test174");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "61", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test175");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass7 = oPTIONArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test176");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper7.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test177");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "61", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test178");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test179");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test180");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "34", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test181");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "0", 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test182");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test183");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "64", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test184");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test185");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34", (int) (byte) 1, writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test186");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test187");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test188");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "0", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test189");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test190");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass5 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test191");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23", (-1), writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test192");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A", (int) '#', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test193");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str8 = numericEntityUnescaper6.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test194");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate(charSequence6, (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test195");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper1.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test196");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = oPTION5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test197");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test198");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test199");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test200");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "61", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test201");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator5.translate((java.lang.CharSequence) "1", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test202");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test203");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = null;
        boolean boolean8 = numericEntityUnescaper2.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test204");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test205");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass8 = oPTIONArray2.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test206");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test207");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass5 = oPTIONArray2.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test208");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test209");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "61", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test210");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "20", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test211");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean8 = numericEntityUnescaper4.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test212");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test213");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = numericEntityUnescaper2.translate(charSequence5);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test214");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "A", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test215");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = oPTION4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test216");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test217");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!", writer4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test218");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A", 10, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test219");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test220");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = null;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test221");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "23", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test222");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "34", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test223");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityUnescaper6.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test224");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "20");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test225");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test226");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "34", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test227");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test228");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test229");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test230");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "", writer3);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test231");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test232");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test233");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.Class<?> wildcardClass5 = numericEntityUnescaper4.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test234");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34", (int) (byte) 1, writer6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "FFFFFFFF");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test235");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslatorArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test236");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1", (int) (byte) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test237");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = null;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test238");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test239");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = null;
        boolean boolean9 = numericEntityUnescaper1.isSet(oPTION8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test240");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "34", 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test241");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test242");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray3);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityUnescaper4.with(charSequenceTranslatorArray7);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper2.with(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray3);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test243");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer7 = null;
        int int8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "0", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test244");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION5 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray7);
        java.lang.Class<?> wildcardClass9 = oPTIONArray7.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test245");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str8 = numericEntityUnescaper6.translate((java.lang.CharSequence) "A");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test246");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test247");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test248");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20", (int) (short) 0, writer6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test249");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test250");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean8 = numericEntityUnescaper6.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test251");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
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
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test252");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass8 = charSequenceTranslator5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test253");
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
            numericEntityUnescaper6.translate((java.lang.CharSequence) "34", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test254");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test255");
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
            numericEntityUnescaper6.translate((java.lang.CharSequence) "64", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test256");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test257");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "", (int) ' ', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test258");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test259");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION5 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray7);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper9 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test260");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass8 = charSequenceTranslator5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test261");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "61", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test262");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test263");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = numericEntityUnescaper1.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test264");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str8 = numericEntityUnescaper6.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test265");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test266");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test267");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "61", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test268");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test269");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass5 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test270");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test271");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "61");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test272");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = null;
        boolean boolean8 = numericEntityUnescaper4.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test273");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityUnescaper5.translate(charSequence6);
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "64");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test274");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test275");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test276");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34", (int) (short) 10, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test277");
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
            numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test278");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass8 = oPTIONArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test279");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "1", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test280");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "FFFFFFFF");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test281");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test282");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass9 = oPTIONArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test283");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = null;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = null;
        boolean boolean8 = numericEntityUnescaper4.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test284");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test285");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test286");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = charSequenceTranslator5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test287");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = numericEntityUnescaper2.translate(charSequence5);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test288");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test289");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test290");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "1", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test291");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test292");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test293");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test294");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test295");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test296");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityUnescaper4.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test297");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test298");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test299");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test300");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean8 = numericEntityUnescaper6.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = oPTION7.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test301");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test302");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test303");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str8 = numericEntityUnescaper6.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test304");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test305");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test306");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test307");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper8 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper8.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test308");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass4 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test309");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper1.with(charSequenceTranslatorArray8);
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test310");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test311");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = oPTION5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test312");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "0", (int) 'a', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test313");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test314");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test315");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test316");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test317");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "A", (int) (short) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test318");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test319");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper3.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = oPTION6.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test320");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test321");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "A", (int) (byte) 0, writer8);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test322");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test323");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str8 = numericEntityUnescaper6.translate((java.lang.CharSequence) "34");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test324");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0", 1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test325");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = oPTION4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test326");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = numericEntityUnescaper2.translate(charSequence5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = numericEntityUnescaper2.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test327");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "", (-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test328");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test329");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "0", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test330");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "FFFFFFFF");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test331");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test332");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test333");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test334");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "A", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test335");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "61", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test336");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "", (int) (short) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test337");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test338");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "", writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test339");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test340");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityUnescaper5.translate(charSequence6);
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "34");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test341");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test342");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test343");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test344");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test345");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test346");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!", (-1), writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test347");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate(charSequence4, 100, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test348");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test349");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean8 = numericEntityUnescaper6.isSet(oPTION7);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test350");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test351");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test352");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test353");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test354");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test355");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test356");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper7.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test357");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test358");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = oPTION6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test359");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = numericEntityUnescaper2.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test360");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "0", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test361");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test362");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper3.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test363");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper5.translate((java.lang.CharSequence) "20", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test364");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = numericEntityUnescaper4.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test365");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "A", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test366");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = oPTION4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test367");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test368");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23", 0, writer8);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test369");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23", (int) (short) 100, writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test370");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean8 = numericEntityUnescaper2.isSet(oPTION7);
        java.lang.Class<?> wildcardClass9 = oPTION7.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test371");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean9 = numericEntityUnescaper1.isSet(oPTION8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION8 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION8.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test372");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "1", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test373");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20", (int) (short) 0, writer6);
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test374");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean8 = numericEntityUnescaper4.isSet(oPTION7);
        boolean boolean9 = numericEntityUnescaper1.isSet(oPTION7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION7 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION7.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test375");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test376");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper7 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str9 = numericEntityUnescaper7.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test377");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper5.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test378");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test379");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "1", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test380");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "34", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test381");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "34", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test382");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate(charSequence6, (int) '#', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test383");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test384");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test385");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str8 = numericEntityUnescaper6.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper6.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test386");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "", 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test387");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityUnescaper2.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test388");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
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
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test389");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = numericEntityUnescaper2.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test390");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test391");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test392");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test393");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test394");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "A", 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test395");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test396");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "20", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test397");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = charSequenceTranslator5.translate((java.lang.CharSequence) "23");
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
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test398");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test399");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test400");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test401");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = oPTION4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test402");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test403");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "", 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test404");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A", (int) (byte) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test405");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", (int) (byte) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test406");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityUnescaper4.with(charSequenceTranslatorArray7);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper1.with(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test407");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "0", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test408");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test409");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test410");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "61");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test411");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test412");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test413");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test414");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test415");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "64", (int) '4', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test416");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test417");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0", 1, writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test418");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test419");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!", (int) (byte) 100, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test420");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test421");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = null;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test422");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test423");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "34", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test424");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test425");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test426");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test427");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = null;
        boolean boolean6 = numericEntityUnescaper4.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test428");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper6.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test429");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "20", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test430");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "23");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test431");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "A", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test432");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test433");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test434");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test435");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = null;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test436");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "A", 1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test437");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test438");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "20", 0, writer8);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test439");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test440");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test441");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test442");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityUnescaper1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test443");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test444");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", 0, writer4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test445");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test446");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test447");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate(charSequence6, (int) '4', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test448");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper4.translate((java.lang.CharSequence) "", writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test449");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "", (int) (byte) -1, writer6);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test450");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper3.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test451");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test452");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test453");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION3 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1, oPTION2, oPTION3 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "A", 0, writer8);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION3 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION3.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test454");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "61" + "'", str5.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test455");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper4.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test456");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper3.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test457");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION7 = null;
        boolean boolean8 = numericEntityUnescaper2.isSet(oPTION7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test458");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "A", (int) (short) 10, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test459");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", 0, writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test460");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "", writer7);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test461");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = null;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test462");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper1.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test463");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test464");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "hi!", (int) (short) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION2 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION2.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test465");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test466");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str7 = numericEntityUnescaper5.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test467");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean9 = numericEntityUnescaper3.isSet(oPTION8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        org.junit.Assert.assertTrue("'" + oPTION8 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION8.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test468");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper3.translate((java.lang.CharSequence) "61", writer5);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test469");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61", 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test470");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate(charSequence6, (int) (short) 1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test471");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper6 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test472");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test473");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityUnescaper5.translate(charSequence6);
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper5.getClass();
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test474");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test475");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "61" + "'", str5.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test476");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION8 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean9 = numericEntityUnescaper1.isSet(oPTION8);
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
        org.junit.Assert.assertTrue("'" + oPTION8 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION8.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test477");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "", (-1), writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test478");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = null;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityUnescaper1.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + oPTION4 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional + "'", oPTION4.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonOptional));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test479");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test480");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean5 = numericEntityUnescaper1.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "", (int) (short) -1, writer8);
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test481");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean7 = numericEntityUnescaper5.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = oPTION6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test482");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        int int7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "23", 0, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test483");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION2 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean3 = numericEntityUnescaper1.isSet(oPTION2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityUnescaper1.with(charSequenceTranslatorArray4);
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test484");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper5 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper5.translate((java.lang.CharSequence) "1", (int) (short) 0, writer8);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test485");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test486");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "0", 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test487");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34", 1, writer8);
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test488");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", 0, writer4);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION6 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        boolean boolean7 = numericEntityUnescaper1.isSet(oPTION6);
        java.lang.Class<?> wildcardClass8 = oPTION6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + oPTION6 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION6.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test489");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "20");
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test490");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "");
        java.lang.String str7 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test491");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = numericEntityUnescaper2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test492");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "A", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test493");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityUnescaper2.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "FFFFFFFF");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test494");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION4 = null;
        boolean boolean5 = numericEntityUnescaper3.isSet(oPTION4);
        java.lang.String str7 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test495");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityUnescaper1.translate((java.lang.CharSequence) "1", 0, writer4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityUnescaper1.translate((java.lang.CharSequence) "64", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test496");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "61");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION5 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        boolean boolean6 = numericEntityUnescaper2.isSet(oPTION5);
        java.lang.String str8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = numericEntityUnescaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        org.junit.Assert.assertTrue("'" + oPTION5 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION5.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test497");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper4 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str6 = numericEntityUnescaper4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = numericEntityUnescaper4.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test498");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str4 = numericEntityUnescaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        int int8 = numericEntityUnescaper2.translate((java.lang.CharSequence) "hi!", 1, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test499");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray0 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] {};
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper1 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray0);
        java.lang.String str3 = numericEntityUnescaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass4 = numericEntityUnescaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityUnescaper0.test500");
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION0 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION oPTION1 = org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon;
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] oPTIONArray2 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION[] { oPTION0, oPTION1 };
        org.apache.commons.lang3.text.translate.NumericEntityUnescaper numericEntityUnescaper3 = new org.apache.commons.lang3.text.translate.NumericEntityUnescaper(oPTIONArray2);
        java.lang.String str5 = numericEntityUnescaper3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityUnescaper3.translate((java.lang.CharSequence) "hi!", (int) ' ', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + oPTION0 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired + "'", oPTION0.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.semiColonRequired));
        org.junit.Assert.assertTrue("'" + oPTION1 + "' != '" + org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon + "'", oPTION1.equals(org.apache.commons.lang3.text.translate.NumericEntityUnescaper.OPTION.errorIfNoSemiColon));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(oPTIONArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }
}

