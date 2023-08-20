
package LookupTranslator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LookupTranslator1 {

    public static boolean debug = false;

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test501");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test502");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test503");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1 };
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test504");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test505");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test506");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test507");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test508");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test509");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test510");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test511");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test512");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test513");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test514");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test515");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test516");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test517");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test518");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test519");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test520");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test521");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test522");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test523");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test524");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test525");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test526");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test527");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test528");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test529");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test530");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test531");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test532");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test533");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test534");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test535");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test536");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test537");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test538");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test539");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test540");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test541");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test542");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test543");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test544");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test545");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test546");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test547");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test548");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test549");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test550");
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] { "0" };
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "0" };
        java.lang.CharSequence[] charSequenceArray5 = new java.lang.CharSequence[] { "0" };
        java.lang.CharSequence[][] charSequenceArray6 = new java.lang.CharSequence[][] { charSequenceArray1, charSequenceArray3, charSequenceArray5 };
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test551");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test552");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test553");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test554");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test555");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test556");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test557");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test558");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator1.test559");
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

