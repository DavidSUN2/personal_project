package OctalUnescaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OctalUnescaper1 {

    public static boolean debug = false;

    @Test
    public void OctalUnescaper501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper501");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = charSequenceTranslator4.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray7.getClass();
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
    public void OctalUnescaper502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper502");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void OctalUnescaper503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper503");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void OctalUnescaper504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper504");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "64", writer8);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void OctalUnescaper505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper505");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer6);
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
    public void OctalUnescaper506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper506");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = charSequenceTranslator4.translate(charSequence5);
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
    public void OctalUnescaper507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper507");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void OctalUnescaper508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper508");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void OctalUnescaper509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper509");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void OctalUnescaper510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper510");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void OctalUnescaper511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper511");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void OctalUnescaper512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper512");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper5 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    }

    @Test
    public void OctalUnescaper513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper513");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer8);
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
    public void OctalUnescaper514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper514");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "61", 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void OctalUnescaper515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper515");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) -1, writer7);
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
    public void OctalUnescaper516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper516");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
    }

    @Test
    public void OctalUnescaper517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper517");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void OctalUnescaper518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper518");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper519");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
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
    }

    @Test
    public void OctalUnescaper520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper520");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "34", 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void OctalUnescaper521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper521");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer6);
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
    public void OctalUnescaper522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper1.OctalUnescaper522");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

