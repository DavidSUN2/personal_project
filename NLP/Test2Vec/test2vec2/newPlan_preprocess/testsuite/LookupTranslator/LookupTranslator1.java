package LookupTranslator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LookupTranslator1 {

    public static boolean debug = false;

    @Test
    public void LookupTranslator501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator501");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "61", (int) (byte) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator502");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator503");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1 };
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
    }

    @Test
    public void LookupTranslator504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator504");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "23", (int) (byte) 10, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator505");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "A", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
    }

    @Test
    public void LookupTranslator506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator506");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = lookupTranslator4.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator507");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void LookupTranslator508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator508");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = lookupTranslator1.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void LookupTranslator509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator509");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "1", "0", "FFFFFFFF" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "1", "0", "FFFFFFFF" };
        java.lang.CharSequence[][] charSequenceArray8 = new java.lang.CharSequence[][] { charSequenceArray3, charSequenceArray7 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator9 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray8);
    }

    @Test
    public void LookupTranslator510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator510");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "1", (int) '4', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator511");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "hi!", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void LookupTranslator512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator512");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator513");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = lookupTranslator5.translate(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void LookupTranslator514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator514");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator515");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = lookupTranslator5.translate(charSequence6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator516");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void LookupTranslator517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator517");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = lookupTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator518");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator519");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void LookupTranslator520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator520");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void LookupTranslator521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator521");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (short) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator522");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator523");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "61", (int) (byte) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator524");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void LookupTranslator525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator525");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass4 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void LookupTranslator526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator526");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = lookupTranslator3.with(charSequenceTranslatorArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator527");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator528");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (byte) 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator529");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.Class<?> wildcardClass8 = lookupTranslator7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator530");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "61", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator531");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator532");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "61", (int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator533");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator534");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator535");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "", (int) (byte) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator536");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "60", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator537");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = lookupTranslator7.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void LookupTranslator538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator538");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator1.translate(charSequence4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) ' ', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator539");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) ' ', writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void LookupTranslator540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator540");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator541");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (short) 10, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator542");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator543");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
    }

    @Test
    public void LookupTranslator544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator544");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = lookupTranslator5.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator545");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = lookupTranslator5.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator546");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator547");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "23", (int) (byte) -1, writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator548");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void LookupTranslator549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator549");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "60");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "60" + "'", str7.equals("60"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator550");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "0" };
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "0" };
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "0" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray1, charSequenceArray3, charSequenceArray5 };
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
    }

    @Test
    public void LookupTranslator551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator551");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = lookupTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator552");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
    }

    @Test
    public void LookupTranslator553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator553");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator554");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator555");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "61", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
    }

    @Test
    public void LookupTranslator556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator556");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void LookupTranslator557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator557");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void LookupTranslator558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator558");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "60", 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.LookupTranslator559");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslatorArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

