package UnicodeUnescaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnicodeUnescaper1 {

    public static boolean debug = false;

    @Test
    public void UnicodeUnescaper501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper501");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void UnicodeUnescaper502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper502");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void UnicodeUnescaper503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper503");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeUnescaper504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper504");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper505");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
    }

    @Test
    public void UnicodeUnescaper506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper506");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper507");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper508");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void UnicodeUnescaper509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper509");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper510");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "", (int) 'a', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
    }

    @Test
    public void UnicodeUnescaper511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper511");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
    }

    @Test
    public void UnicodeUnescaper512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper512");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper513");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper514");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper515");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = charSequenceTranslator4.translate(charSequence5);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper516");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper517");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper518");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper519");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper520");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper521");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper522");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper523");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = charSequenceTranslator4.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper524");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper525");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", 0, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper526");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper527");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str8 = charSequenceTranslator2.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper528");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper529");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void UnicodeUnescaper530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper530");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = charSequenceTranslator2.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void UnicodeUnescaper531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper531");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper532");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void UnicodeUnescaper533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper533");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper534");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void UnicodeUnescaper535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper535");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass5 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper536");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void UnicodeUnescaper537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper537");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void UnicodeUnescaper538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper538");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper539");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper540");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper541");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper542");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void UnicodeUnescaper543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper543");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper544");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper545");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper546");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void UnicodeUnescaper547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper547");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper548");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper549");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper550");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper551");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper552");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper553");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper1.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper554");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeUnescaper0.translate(charSequence3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void UnicodeUnescaper555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper555");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper556");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper557");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void UnicodeUnescaper558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper558");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper559");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper560");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeUnescaper0.translate(charSequence3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper561");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper562");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper563");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper564");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper565");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper566");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper567");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper568");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper569");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper570");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void UnicodeUnescaper571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper571");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void UnicodeUnescaper572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper572");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper573");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void UnicodeUnescaper574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper574");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper575");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper576");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void UnicodeUnescaper577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper577");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper578");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper579");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper580");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper581");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper582");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper583");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34", (int) (byte) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
    }

    @Test
    public void UnicodeUnescaper584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper584");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper585");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", 1, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeUnescaper586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper586");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper587");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper588");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper589");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper590");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void UnicodeUnescaper591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper591");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper592");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate(charSequence7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper593");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void UnicodeUnescaper594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper594");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper595");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper596");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void UnicodeUnescaper597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper597");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper598");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper599");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper600");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper601");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper602");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper603");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper604");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void UnicodeUnescaper605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper605");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void UnicodeUnescaper606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper606");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper607");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper608");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void UnicodeUnescaper609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper609");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void UnicodeUnescaper610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper610");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper611");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper612");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper613");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper614");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper615");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper616");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void UnicodeUnescaper617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper617");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeUnescaper0.translate(charSequence3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void UnicodeUnescaper618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper618");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper619");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper620");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper621");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void UnicodeUnescaper622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper622");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
    }

    @Test
    public void UnicodeUnescaper623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper623");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate(charSequence5, (-1), writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper624");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", (int) '4', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper625");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper626");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper627");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper628");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str8 = charSequenceTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper629");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper630");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper631");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "23");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "23" + "'", str4.equals("23"));
    }

    @Test
    public void UnicodeUnescaper632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper632");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void UnicodeUnescaper633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper633");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper634");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = charSequenceTranslator4.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper635");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper636");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
    }

    @Test
    public void UnicodeUnescaper637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper637");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper638");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper639");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper640");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate(charSequence7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper641");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper642");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void UnicodeUnescaper643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper643");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper644");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = charSequenceTranslator4.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper645");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper646");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper647");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper648");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper649");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper650");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", 0, writer5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper651");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper652");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper653");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper654");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) ' ', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void UnicodeUnescaper655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper655");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper656");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper657");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper658");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper659");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper660");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (-1), writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper661");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper662");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeUnescaper0.translate(charSequence3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void UnicodeUnescaper663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper663");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper664");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void UnicodeUnescaper665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper665");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate(charSequence5, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void UnicodeUnescaper666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper666");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper667");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper668");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper669");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper670");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void UnicodeUnescaper671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper671");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper672");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper673");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper674");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper675");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper676");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper677");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper678");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void UnicodeUnescaper679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper679");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper680");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper681");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper682");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper683");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void UnicodeUnescaper684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper684");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper685");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void UnicodeUnescaper686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper686");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper687");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void UnicodeUnescaper688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper688");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void UnicodeUnescaper689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper689");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper690");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper691");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper692");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void UnicodeUnescaper693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper693");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void UnicodeUnescaper694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper694");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper695");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper696");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void UnicodeUnescaper697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper697");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper698");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper699");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void UnicodeUnescaper700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper700");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate(charSequence7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper701");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper702");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper703");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper704");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
    }

    @Test
    public void UnicodeUnescaper705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper705");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper706");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper707");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper708");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
    }

    @Test
    public void UnicodeUnescaper709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper709");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper710");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void UnicodeUnescaper711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper711");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper712");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper713");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper714");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void UnicodeUnescaper715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper715");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper716");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper717");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void UnicodeUnescaper718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper718");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper719");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", (int) '4', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper720");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void UnicodeUnescaper721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper721");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper722");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void UnicodeUnescaper723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper723");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper724");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void UnicodeUnescaper725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper725");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper726");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper727");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper728");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "23", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper729");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper730");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", (int) (byte) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper731");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper732");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper733");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
    }

    @Test
    public void UnicodeUnescaper734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper734");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = charSequenceTranslator6.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void UnicodeUnescaper735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper735");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper736");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper737");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper738");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper739");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void UnicodeUnescaper740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper740");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void UnicodeUnescaper741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper741");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper742");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper743");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper744");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = charSequenceTranslator2.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void UnicodeUnescaper745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper745");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper746");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper747");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper748");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper749");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper750");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) ' ', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void UnicodeUnescaper751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper751");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper752");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper753");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper754");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper755");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void UnicodeUnescaper756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper756");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper757");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper758");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper759");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper760");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeUnescaper761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper761");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper762");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper763");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper764");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper765");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper766");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper767");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", 100, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper768");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void UnicodeUnescaper769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper769");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", (int) '#', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void UnicodeUnescaper770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper770");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper771");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "23");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "23" + "'", str4.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper772");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
    }

    @Test
    public void UnicodeUnescaper773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper773");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper774");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeUnescaper775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper775");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper776");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", 1, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper777");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper778");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper779");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void UnicodeUnescaper780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper780");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper781");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) ' ', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper782");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void UnicodeUnescaper783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper1.UnicodeUnescaper783");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = charSequenceTranslator4.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }
}

