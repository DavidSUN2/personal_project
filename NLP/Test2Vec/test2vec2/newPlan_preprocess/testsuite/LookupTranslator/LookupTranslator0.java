package LookupTranslator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LookupTranslator0 {

    public static boolean debug = false;

    @Test
    public void LookupTranslator001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void LookupTranslator002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator002");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1, charSequenceArray2 };
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator003");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void LookupTranslator004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator004");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void LookupTranslator005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator005");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator006");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = lookupTranslator1.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void LookupTranslator007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator007");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator008");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            int int9 = lookupTranslator1.translate(charSequence6, (int) (byte) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator009");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void LookupTranslator010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator010");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void LookupTranslator011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator011");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator012");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void LookupTranslator013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator013");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator014");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void LookupTranslator015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator015");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass3 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void LookupTranslator016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator016");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator017");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void LookupTranslator018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator018");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
    }

    @Test
    public void LookupTranslator019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator019");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "", 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator020");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void LookupTranslator021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator021");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "1", (int) (short) 10, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator022");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass5 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void LookupTranslator023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator023");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void LookupTranslator024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator024");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "20", (int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator025");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void LookupTranslator026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator026");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator027");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.Class<?> wildcardClass6 = charSequenceArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator028");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (byte) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator029");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator5.translate((java.lang.CharSequence) "1", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator030");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "34", writer7);
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
    public void LookupTranslator031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator031");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass5 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void LookupTranslator032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator032");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator033");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator034");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator035");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = lookupTranslator7.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator036");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass4 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void LookupTranslator037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator037");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (short) 1, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator038");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator039");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator4.translate((java.lang.CharSequence) "0", (int) 'a', writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void LookupTranslator040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator040");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "34", writer6);
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
    public void LookupTranslator041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator041");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void LookupTranslator042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator042");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void LookupTranslator043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator043");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void LookupTranslator044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator044");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass6 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator045");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            int int9 = lookupTranslator5.translate(charSequence6, (int) (short) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator046");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void LookupTranslator047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator047");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void LookupTranslator048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator048");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator049");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (short) 1, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator050");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator051");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "61", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void LookupTranslator052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator052");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator053");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator8 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.Class<?> wildcardClass9 = charSequenceArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator054");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "hi!", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
    }

    @Test
    public void LookupTranslator055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator055");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator056");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator057");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "61", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator058");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass4 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void LookupTranslator059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator059");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void LookupTranslator060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator060");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
    }

    @Test
    public void LookupTranslator061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator061");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator062");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator4.translate((java.lang.CharSequence) "23", 10, writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator063");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "34", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void LookupTranslator064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator064");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass6 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator065");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator066");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "23", (int) ' ', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator067");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str9 = lookupTranslator7.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void LookupTranslator068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator068");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "", writer6);
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
    public void LookupTranslator069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator069");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass3 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void LookupTranslator070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator070");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass7 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator071");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator072");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence[][] charSequenceArray2 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray2);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "0");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { lookupTranslator3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = lookupTranslator1.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void LookupTranslator073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator073");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "20", (int) (short) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator074");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator5.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator075");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void LookupTranslator076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator076");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator077");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }

    @Test
    public void LookupTranslator078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator078");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "hi!", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void LookupTranslator079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator079");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator080");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator8 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator9 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator081");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator8 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator9 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator082");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.Class<?> wildcardClass7 = charSequenceArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator083");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator084");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator085");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str9 = lookupTranslator7.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator086");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (short) 100, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator087");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator5.translate((java.lang.CharSequence) "64", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator088");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1, charSequenceArray2, charSequenceArray3 };
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray4);
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
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
    }

    @Test
    public void LookupTranslator089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator089");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate(charSequence4, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator090");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator091");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass5 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void LookupTranslator092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator092");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "hi!", (int) (short) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator093");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer7);
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
    public void LookupTranslator094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator094");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "1", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void LookupTranslator095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator095");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str9 = lookupTranslator7.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator096");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
    }

    @Test
    public void LookupTranslator097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator097");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str9 = lookupTranslator7.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator098");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator099");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator100");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator101");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator102");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass6 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator103");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str9 = lookupTranslator7.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator104");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator105");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator106");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (short) 100, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator107");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
    }

    @Test
    public void LookupTranslator108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator108");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "23", 1, writer6);
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator109");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator110");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "1", (int) (short) 10, writer6);
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void LookupTranslator111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator111");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void LookupTranslator112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator112");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator113");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.lang.Class<?> wildcardClass7 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator114");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass4 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void LookupTranslator115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator115");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator116");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "23");
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = lookupTranslator5.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void LookupTranslator117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator117");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator118");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void LookupTranslator119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator119");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator8 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass9 = lookupTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator120");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate(charSequence6, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }

    @Test
    public void LookupTranslator121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator121");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "23", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator122");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "64", (int) (byte) 100, writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator123");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator124");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void LookupTranslator125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator125");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator126");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator127");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator128");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.Class<?> wildcardClass8 = charSequenceArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator129");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (byte) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator130");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "61", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
    }

    @Test
    public void LookupTranslator131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator131");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass4 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void LookupTranslator132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator132");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void LookupTranslator133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator133");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "20", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }

    @Test
    public void LookupTranslator134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator134");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "64", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator135");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator136");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "", (int) (short) 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator137");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate(charSequence7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void LookupTranslator138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator138");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator139");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void LookupTranslator140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator140");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator141");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator142");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "1", (int) (short) -1, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator143");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator144");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "20", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator145");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass8 = lookupTranslator7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator146");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) (short) 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator147");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator5.translate((java.lang.CharSequence) "34", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator148");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void LookupTranslator149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator149");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "34", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator150");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator151");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator152");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass7 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator153");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator154");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "1", (int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator155");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "1", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
    }

    @Test
    public void LookupTranslator156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator156");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "0", (int) (short) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator157");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = lookupTranslator1.translate(charSequence6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator158");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = lookupTranslator1.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void LookupTranslator159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator159");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "23", 1, writer6);
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator160");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
    }

    @Test
    public void LookupTranslator161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator161");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "23", (int) '#', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator162");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) (byte) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator163");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass8 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator164");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.Class<?> wildcardClass6 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator165");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = lookupTranslator1.translate(charSequence6);
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = lookupTranslator1.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void LookupTranslator166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator166");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void LookupTranslator167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator167");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator168");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void LookupTranslator169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator169");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator170");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = lookupTranslator7.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void LookupTranslator171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator171");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (byte) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator172");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator173");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = lookupTranslator1.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator174");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = lookupTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator175");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator8 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass9 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator176");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator177");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = lookupTranslator1.translate(charSequence6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = lookupTranslator1.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void LookupTranslator178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator178");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "20", (-1), writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator179");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator180");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator181");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator5.translate((java.lang.CharSequence) "", 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator182");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = lookupTranslator1.translate(charSequence6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator183");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
    }

    @Test
    public void LookupTranslator184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator184");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            int int9 = lookupTranslator1.translate(charSequence6, 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void LookupTranslator185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator185");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void LookupTranslator186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator186");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void LookupTranslator187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator187");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator188");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "34", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void LookupTranslator189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator189");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator4.translate((java.lang.CharSequence) "0", 0, writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator190");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = lookupTranslator2.with(charSequenceTranslatorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void LookupTranslator191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator191");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator192");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = lookupTranslator2.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator193");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "34", 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator194");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator1.translate(charSequence4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) '4', writer8);
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
    public void LookupTranslator195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator195");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "20", (int) '4', writer7);
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
    public void LookupTranslator196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator196");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator197");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator198");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator199");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "34", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void LookupTranslator200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator200");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "23", 1, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator201");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void LookupTranslator202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator202");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = lookupTranslator2.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator203");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "1", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
    }

    @Test
    public void LookupTranslator204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator204");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) (byte) -1, writer8);
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
    public void LookupTranslator205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator205");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
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

    @Test
    public void LookupTranslator206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator206");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "20", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }

    @Test
    public void LookupTranslator207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator207");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "1", (int) (short) 10, writer6);
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator208");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator209");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass6 = lookupTranslator5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator210");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator5.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator211");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator5.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator212");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void LookupTranslator213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator213");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator214");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator215");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator216");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void LookupTranslator217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator217");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "23", 0, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator218");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void LookupTranslator219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator219");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) -1, writer6);
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator220");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator221");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator5.translate((java.lang.CharSequence) "1", (int) (short) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator222");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "61", (int) '#', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator223");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "61", writer7);
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
    public void LookupTranslator224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator224");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator225");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator226");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "20", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator227");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) (byte) -1, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void LookupTranslator228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator228");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator229");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void LookupTranslator230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator230");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = lookupTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator231");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator232");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator5.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator233");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = lookupTranslator4.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator234");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
    }

    @Test
    public void LookupTranslator235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator235");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void LookupTranslator236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator236");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator5.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator237");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator238");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void LookupTranslator239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator239");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator5.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator240");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void LookupTranslator241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator241");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator5.translate((java.lang.CharSequence) "A", 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator242");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "61", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator243");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "1", (int) (short) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator244");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator245");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator246");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "A", 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator247");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass6 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator248");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "", 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator249");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (short) 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator250");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void LookupTranslator251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator251");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator252");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void LookupTranslator253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator253");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) ' ', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator254");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator4.translate((java.lang.CharSequence) "1", (int) ' ', writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator255");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void LookupTranslator256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator256");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "0", writer7);
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
    public void LookupTranslator257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator257");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator258");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslator7.getClass();
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

    @Test
    public void LookupTranslator259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator259");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "A", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void LookupTranslator260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator260");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "61", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator261");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator262");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator5.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator263");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator264");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator265");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator266");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass8 = lookupTranslator5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator267");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (byte) 100, writer8);
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
    public void LookupTranslator268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator268");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "20", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void LookupTranslator269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator269");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) '#', writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator270");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator271");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "34", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void LookupTranslator272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator272");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator1.translate(charSequence4);
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator273");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator274");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator275");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator276");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (byte) -1, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator277");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator278");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator5.translate((java.lang.CharSequence) "hi!", 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator279");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate(charSequence4, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void LookupTranslator280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator280");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass4 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void LookupTranslator281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator281");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator282");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator5.translate((java.lang.CharSequence) "hi!", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator283");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void LookupTranslator284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator284");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator285");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "1", (int) (short) -1, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void LookupTranslator286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator286");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "20", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void LookupTranslator287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator287");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator288");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator289");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator290");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (short) 10, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator291");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass7 = lookupTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator292");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void LookupTranslator293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator293");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = lookupTranslator1.translate(charSequence6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator294");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator295");
        java.lang.CharSequence[] charSequenceArray6 = new java.lang.CharSequence[] { "FFFFFFFF", "hi!", "FFFFFFFF", "61", "1", "64" };
        java.lang.CharSequence[][] charSequenceArray7 = new java.lang.CharSequence[][] { charSequenceArray6 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator8 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray7);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator9 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray7);
    }

    @Test
    public void LookupTranslator296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator296");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = lookupTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "60" + "'", str8.equals("60"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator297");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) ' ', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator298");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "1", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator299");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "1", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator300");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "1", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void LookupTranslator301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator301");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator5.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator302");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) '#', writer8);
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
    public void LookupTranslator303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator303");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void LookupTranslator304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator304");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator305");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator5.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void LookupTranslator306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator306");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) 'a', writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator307");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (byte) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator308");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator309");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator310");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void LookupTranslator311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator311");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator312");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = lookupTranslator4.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator313");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = lookupTranslator4.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "60" + "'", str8.equals("60"));
    }

    @Test
    public void LookupTranslator314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator314");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator315");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "34", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator316");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = lookupTranslator2.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator317");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator4.translate((java.lang.CharSequence) "61", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator318");
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] { "60", "23", "20" };
        java.lang.CharSequence[] charSequenceArray7 = new java.lang.CharSequence[] { "60", "23", "20" };
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
    public void LookupTranslator319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator319");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "0", 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator320");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator321");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void LookupTranslator322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator322");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void LookupTranslator323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator323");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator324");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator325");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator326");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void LookupTranslator327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator327");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator5.translate((java.lang.CharSequence) "A", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator328");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void LookupTranslator329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator329");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void LookupTranslator330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator330");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
    }

    @Test
    public void LookupTranslator331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator331");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }

    @Test
    public void LookupTranslator332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator332");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator333");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator334");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator335");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "23", 0, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator336");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "61", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void LookupTranslator337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator337");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator338");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "1", (int) (short) 10, writer6);
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator339");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator340");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void LookupTranslator341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator341");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator342");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) 'a', writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator343");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "hi!", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator344");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "60" + "'", str6.equals("60"));
    }

    @Test
    public void LookupTranslator345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator345");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "23", 0, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator346");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator347");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void LookupTranslator348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator348");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator1.translate(charSequence4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void LookupTranslator349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator349");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass7 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator350");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void LookupTranslator351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator351");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
    }

    @Test
    public void LookupTranslator352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator352");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            int int6 = lookupTranslator2.translate(charSequence3, (int) (byte) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator353");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void LookupTranslator354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator354");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "34", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator355");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator356");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (short) 10, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator357");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator4.translate((java.lang.CharSequence) "64", (int) (short) 100, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void LookupTranslator358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator358");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator359");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator360");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = lookupTranslator1.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void LookupTranslator361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator361");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "1", (int) (short) -1, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator362");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.Class<?> wildcardClass6 = lookupTranslator5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator363");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator364");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator365");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void LookupTranslator366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator366");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = lookupTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator367");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "34", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void LookupTranslator368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator368");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = lookupTranslator4.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "60" + "'", str8.equals("60"));
    }

    @Test
    public void LookupTranslator369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator369");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator370");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void LookupTranslator371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator371");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) (short) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator372");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "61", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator373");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator374");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "34", (int) (short) -1, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void LookupTranslator375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator375");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass6 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator376");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass5 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void LookupTranslator377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator377");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void LookupTranslator378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator378");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator379");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str9 = lookupTranslator7.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator380");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator5.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator381");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate(charSequence6, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void LookupTranslator382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator382");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator383");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = lookupTranslator4.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void LookupTranslator384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator384");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "64", (int) '#', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator385");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator386");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "60");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "60" + "'", str7.equals("60"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator387");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator388");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            int int9 = lookupTranslator1.translate(charSequence6, (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void LookupTranslator389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator389");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator390");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "A", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void LookupTranslator391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator391");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator392");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "61" + "'", str5.equals("61"));
    }

    @Test
    public void LookupTranslator393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator393");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "20", (int) 'a', writer7);
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
    public void LookupTranslator394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator394");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator5.with(charSequenceTranslatorArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator395");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "20", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator396");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void LookupTranslator397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator397");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void LookupTranslator398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator398");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "1", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator399");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void LookupTranslator400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator400");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.Class<?> wildcardClass7 = lookupTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator401");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator4.translate((java.lang.CharSequence) "20", (int) '4', writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator402");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator403");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "34", 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void LookupTranslator404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator404");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
    }

    @Test
    public void LookupTranslator405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator405");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator406");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) -1, writer6);
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator407");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void LookupTranslator408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator408");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void LookupTranslator409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator409");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            int int9 = lookupTranslator5.translate((java.lang.CharSequence) "", (-1), writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator410");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "34" + "'", str7.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator411");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator412");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "34", (int) (byte) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator413");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "0", 1, writer7);
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
    public void LookupTranslator414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator414");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = lookupTranslator4.translate((java.lang.CharSequence) "60");
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "60" + "'", str8.equals("60"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator415");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "1", writer7);
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
    public void LookupTranslator416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator416");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
    }

    @Test
    public void LookupTranslator417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator417");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate(charSequence6, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void LookupTranslator418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator418");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = lookupTranslator4.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void LookupTranslator419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator419");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator420");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "34", writer8);
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
    public void LookupTranslator421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator421");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
    }

    @Test
    public void LookupTranslator422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator422");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator5.translate((java.lang.CharSequence) "64", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator423");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "64", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
    }

    @Test
    public void LookupTranslator424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator424");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void LookupTranslator425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator425");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void LookupTranslator426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator426");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) -1, writer6);
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator427");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "", 10, writer8);
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
    public void LookupTranslator428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator428");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
    }

    @Test
    public void LookupTranslator429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator429");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "23", (int) (short) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator430");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator431");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator432");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator433");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "23", 1, writer6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = lookupTranslator3.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void LookupTranslator434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator434");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "1", writer7);
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
    public void LookupTranslator435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator435");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = lookupTranslator4.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator436");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator437");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "23", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
    }

    @Test
    public void LookupTranslator438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator438");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (short) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator439");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator440");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator441");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "A", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void LookupTranslator442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator442");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator3.translate((java.lang.CharSequence) "1", (int) (short) 10, writer6);
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator443");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator2.translate((java.lang.CharSequence) "64", (int) 'a', writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void LookupTranslator444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator444");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator445");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "1", 1, writer8);
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
    public void LookupTranslator446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator446");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator447");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator4.translate((java.lang.CharSequence) "A", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator448");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi!" + "'", str5.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void LookupTranslator449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator449");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void LookupTranslator450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator450");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator451");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "61", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
    }

    @Test
    public void LookupTranslator452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator452");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str9 = lookupTranslator7.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator453");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator3.translate((java.lang.CharSequence) "0", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }

    @Test
    public void LookupTranslator454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator454");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator455");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void LookupTranslator456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator456");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator457");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator458");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "23", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void LookupTranslator459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator459");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator460");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) (byte) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator461");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "", (-1), writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator462");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
    }

    @Test
    public void LookupTranslator463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator463");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator3.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator464");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "34" + "'", str3.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "20" + "'", str5.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator465");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
    }

    @Test
    public void LookupTranslator466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator466");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) (short) 0, writer8);
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
    public void LookupTranslator467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator467");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator468");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        int int8 = lookupTranslator4.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer7);
        java.lang.Class<?> wildcardClass9 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator469");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void LookupTranslator470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator470");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "61");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "64" + "'", str9.equals("64"));
    }

    @Test
    public void LookupTranslator471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator471");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "34", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator472");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "60", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
    }

    @Test
    public void LookupTranslator473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator473");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void LookupTranslator474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator474");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "1", (int) (short) -1, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator475");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void LookupTranslator476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator476");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void LookupTranslator477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator477");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass4 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void LookupTranslator478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator478");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.Class<?> wildcardClass5 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void LookupTranslator479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator479");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "64", (int) (byte) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator480");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.lang.String str8 = lookupTranslator2.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "60" + "'", str8.equals("60"));
    }

    @Test
    public void LookupTranslator481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator481");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "", (int) 'a', writer5);
        java.lang.Class<?> wildcardClass7 = lookupTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator482");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "23", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void LookupTranslator483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator483");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "FFFFFFFF" + "'", str5.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator484");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
    }

    @Test
    public void LookupTranslator485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator485");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void LookupTranslator486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator486");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "1", (int) (byte) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator487");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void LookupTranslator488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator488");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "23", (int) ' ', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator489");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "20" + "'", str7.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator490");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "hi!", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "64" + "'", str3.equals("64"));
    }

    @Test
    public void LookupTranslator491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator491");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = lookupTranslator3.translate((java.lang.CharSequence) "60");
        java.lang.Class<?> wildcardClass8 = lookupTranslator3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "60" + "'", str7.equals("60"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator492");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) (short) 0, writer6);
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator493");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str7 = lookupTranslator5.translate((java.lang.CharSequence) "");
        java.lang.String str9 = lookupTranslator5.translate((java.lang.CharSequence) "60");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "60" + "'", str9.equals("60"));
    }

    @Test
    public void LookupTranslator494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator494");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator495");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = lookupTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator496");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in LookupTranslator generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "64", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "34" + "'", str5.equals("34"));
    }

    @Test
    public void LookupTranslator497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator497");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator498");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator3.translate((java.lang.CharSequence) "61", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator499");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "34", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.LookupTranslator500");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "23", (int) 'a', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }
}

