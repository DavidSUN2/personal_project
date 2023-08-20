
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
            System.out.format("%n%s%n", "LookupTranslator0.test01");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test02");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test03");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test04");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test05");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", 0, writer4);
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
            System.out.format("%n%s%n", "LookupTranslator0.test06");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) ' ', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test07");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test08");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) ' ', writer4);
        java.lang.CharSequence charSequence6 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate(charSequence6, writer7);
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
            System.out.format("%n%s%n", "LookupTranslator0.test09");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test10");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test11");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test12");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) ' ', writer4);
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test13");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test14");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.lang.Class<?> wildcardClass8 = charSequenceArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test15");
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
            System.out.format("%n%s%n", "LookupTranslator0.test16");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) 'a', writer4);
        java.lang.CharSequence[][] charSequenceArray6 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { lookupTranslator7 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = lookupTranslator1.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test17");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) -1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test18");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test19");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "A", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test20");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) 'a', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "20", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test21");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test22");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "0", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test23");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test24");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) 'a', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", writer7);
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
            System.out.format("%n%s%n", "LookupTranslator0.test25");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (byte) 10, writer8);
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
            System.out.format("%n%s%n", "LookupTranslator0.test26");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test27");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer4);
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
            System.out.format("%n%s%n", "LookupTranslator0.test28");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test29");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer4);
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
            System.out.format("%n%s%n", "LookupTranslator0.test30");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator8 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator9 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test31");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test32");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test33");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.lang.Class<?> wildcardClass7 = lookupTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test34");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer4);
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
            System.out.format("%n%s%n", "LookupTranslator0.test35");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", 0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "0", writer7);
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
            System.out.format("%n%s%n", "LookupTranslator0.test36");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "hi!", 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test37");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", 0, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test38");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator2.translate((java.lang.CharSequence) "0", writer4);
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
            System.out.format("%n%s%n", "LookupTranslator0.test39");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.Class<?> wildcardClass2 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test40");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = lookupTranslator1.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test41");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test42");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass6 = lookupTranslator1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test43");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test44");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", (int) 'a', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass8 = lookupTranslator1.getClass();
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
            System.out.format("%n%s%n", "LookupTranslator0.test45");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = lookupTranslator7.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test46");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", 0, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test47");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", 0, writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (short) 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test48");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) ' ', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "23", (int) ' ', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test49");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.lang.String str8 = lookupTranslator6.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test50");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) ' ', writer4);
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "20", (int) (byte) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test51");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = lookupTranslator1.with(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test52");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test53");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator6.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test54");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) ' ', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test55");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test56");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test57");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator8 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test58");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = lookupTranslator1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "hi!", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test59");
        java.lang.CharSequence[] charSequenceArray4 = new java.lang.CharSequence[] { "hi!", "", "A", "A" };
        java.lang.CharSequence[][] charSequenceArray5 = new java.lang.CharSequence[][] { charSequenceArray4 };
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator6 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator7 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray5);
        java.lang.String str9 = lookupTranslator7.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test60");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test61");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer5 = null;
        int int6 = lookupTranslator2.translate((java.lang.CharSequence) "61", (int) (byte) 10, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test62");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = lookupTranslator1.with(charSequenceTranslatorArray4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator5.translate((java.lang.CharSequence) "61", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test63");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (-1), writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test64");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "", writer3);
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
            System.out.format("%n%s%n", "LookupTranslator0.test65");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator2 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator3 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test66");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = lookupTranslator1.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass6 = charSequenceTranslator5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test67");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        int int9 = lookupTranslator1.translate((java.lang.CharSequence) "A", 0, writer8);
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
            System.out.format("%n%s%n", "LookupTranslator0.test68");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "", 0, writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "0");
        java.lang.String str9 = lookupTranslator1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0" + "'", str7.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test69");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        int int7 = lookupTranslator1.translate((java.lang.CharSequence) "A", (int) (short) 0, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test70");
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
            System.out.format("%n%s%n", "LookupTranslator0.test71");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.io.Writer writer4 = null;
        int int5 = lookupTranslator1.translate((java.lang.CharSequence) "FFFFFFFF", (int) '4', writer4);
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test72");
        java.lang.CharSequence[][] charSequenceArray0 = null;
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = lookupTranslator1.translate((java.lang.CharSequence) "A");
        java.lang.String str7 = lookupTranslator1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "A" + "'", str5.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void LookupTranslator() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "LookupTranslator0.test73");
        java.lang.CharSequence[][] charSequenceArray0 = new java.lang.CharSequence[][] {};
        org.apache.commons.lang3.text.translate.LookupTranslator lookupTranslator1 = new org.apache.commons.lang3.text.translate.LookupTranslator(charSequenceArray0);
        java.lang.String str3 = lookupTranslator1.translate((java.lang.CharSequence) "20");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            lookupTranslator1.translate((java.lang.CharSequence) "A", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "20" + "'", str3.equals("20"));
    }
}

