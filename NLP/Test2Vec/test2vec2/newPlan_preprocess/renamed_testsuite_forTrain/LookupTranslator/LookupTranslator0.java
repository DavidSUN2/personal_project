
package LookupTranslator;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LookupTranslator0 {

    public static boolean debug = false;

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test001");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test002");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1, charSequenceArray2 };
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test003");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test004");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test005");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test006");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test007");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test008");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test009");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test010");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = charSequenceArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test011");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test012");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test013");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test014");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test015");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test016");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test017");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test018");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test019");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test020");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test021");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test022");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test023");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test024");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test025");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test026");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test027");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test028");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test029");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test030");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test031");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test032");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test033");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test034");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test035");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test036");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test037");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test038");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test039");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test040");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test041");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test042");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test043");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test044");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test045");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test046");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test047");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test048");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test049");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test050");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test051");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test052");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test053");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test054");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test055");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test056");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test057");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test058");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test059");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test060");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test061");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test062");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test063");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test064");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test065");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test066");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test067");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test068");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test069");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test070");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test071");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test072");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test073");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test074");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test075");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test076");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test077");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test078");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test079");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test080");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test081");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test082");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test083");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test084");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test085");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test086");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test087");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test088");
        java.lang.CharSequence[] charSequenceArray0 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray1 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[] charSequenceArray3 = new java.lang.CharSequence[] {};
        java.lang.CharSequence[][] charSequenceArray4 = new java.lang.CharSequence[][] { charSequenceArray0, charSequenceArray1, charSequenceArray2, charSequenceArray3 };
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test089");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test090");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test091");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test092");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test093");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test094");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test095");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test096");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test097");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test098");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test099");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test100");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test101");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test102");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test103");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test104");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test105");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test106");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test107");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test108");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test109");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test110");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test111");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test112");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test113");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test114");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test115");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test116");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test117");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test118");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test119");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test120");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test121");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test122");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test123");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test124");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test125");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test126");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test127");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test128");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test129");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test130");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test131");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test132");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test133");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test134");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test135");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test136");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test137");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test138");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test139");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test140");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test141");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test142");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test143");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test144");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test145");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test146");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test147");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test148");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test149");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test150");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test151");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test152");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test153");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test154");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test155");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test156");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test157");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test158");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test159");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test160");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test161");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test162");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test163");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test164");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test165");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test166");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test167");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test168");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test169");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test170");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test171");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test172");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test173");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test174");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test175");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test176");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test177");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = lookupTranslator1.translate(charSequence6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test178");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test179");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test180");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test181");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test182");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test183");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test184");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test185");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test186");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test187");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test188");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test189");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test190");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test191");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test192");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test193");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test194");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test195");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test196");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test197");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test198");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test199");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test200");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test201");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test202");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test203");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test204");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test205");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test206");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test207");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test208");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test209");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test210");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test211");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test212");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test213");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test214");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test215");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test216");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test217");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test218");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test219");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test220");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test221");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test222");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test223");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test224");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test225");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test226");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test227");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test228");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test229");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test230");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test231");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test232");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test233");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test234");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test235");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test236");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test237");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test238");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test239");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test240");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test241");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test242");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test243");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test244");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test245");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test246");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test247");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test248");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test249");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test250");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test251");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test252");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test253");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test254");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test255");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test256");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", (int) 'a', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test257");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test258");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test259");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test260");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test261");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test262");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test263");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test264");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test265");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test266");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test267");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test268");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test269");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test270");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test271");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test272");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test273");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test274");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test275");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test276");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test277");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test278");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test279");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test280");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test281");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test282");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test283");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test284");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test285");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test286");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "20", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test287");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test288");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test289");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test290");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test291");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test292");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test293");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test294");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test295");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test296");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test297");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test298");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test299");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test300");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test301");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test302");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test303");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test304");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test305");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test306");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test307");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test308");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test309");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test310");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test311");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test312");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test313");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test314");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test315");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test316");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test317");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test318");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test319");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test320");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test321");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test322");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test323");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test324");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test325");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test326");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test327");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test328");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test329");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test330");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test331");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test332");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test333");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test334");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test335");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test336");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test337");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test338");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test339");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test340");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test341");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test342");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test343");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test344");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test345");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test346");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test347");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test348");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator1.translate(charSequence4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test349");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test350");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test351");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test352");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test353");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test354");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test355");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test356");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test357");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test358");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test359");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test360");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test361");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test362");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test363");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test364");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test365");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test366");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test367");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test368");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test369");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test370");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test371");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test372");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test373");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test374");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test375");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test376");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test377");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test378");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test379");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test380");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test381");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test382");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test383");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test384");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test385");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test386");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test387");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test388");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test389");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test390");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test391");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test392");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test393");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test394");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test395");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test396");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test397");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.lang.String str6 = lookupTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test398");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test399");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test400");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test401");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test402");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test403");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test404");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test405");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test406");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test407");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test408");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test409");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test410");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test411");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test412");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test413");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test414");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test415");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test416");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test417");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.CharSequence charSequence4 = null;
        java.lang.String str5 = lookupTranslator3.translate(charSequence4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test418");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test419");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test420");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str4 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = lookupTranslator2.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test421");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test422");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test423");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test424");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test425");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test426");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test427");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test428");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test429");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test430");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test431");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test432");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test433");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test434");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test435");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test436");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test437");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test438");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test439");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test440");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test441");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test442");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test443");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test444");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test445");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test446");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test447");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test448");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test449");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test450");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test451");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test452");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test453");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str5 = lookupTranslator3.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test454");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test455");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test456");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test457");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 100, writer4);
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
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test458");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "0", (int) (byte) 10, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test459");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test460");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test461");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test462");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test463");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test464");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test465");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test466");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test467");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (byte) 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test468");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test469");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test470");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test471");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test472");
        java.lang.CharSequence[] charSequenceArray2 = new java.lang.CharSequence[] { "1", "0" };
        java.lang.CharSequence[][] charSequenceArray3 = new java.lang.CharSequence[][] { charSequenceArray2 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator4 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator5 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test473");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test474");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test475");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test476");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test477");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test478");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test479");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test480");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test481");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test482");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test483");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test484");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test485");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test486");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test487");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test488");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test489");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test490");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test491");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test492");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test493");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test494");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test495");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test496");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test497");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test498");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test499");
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
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test500");
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

