
package UnicodeUnescaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnicodeUnescaper0 {

    public static boolean debug = false;

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test01");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test02");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test03");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", 10, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test04");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test05");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test06");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str3 = unicodeUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper1, unicodeUnescaper4 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test07");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str3 = unicodeUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper1, unicodeUnescaper4 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test08");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test09");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test10");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass3 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test11");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test12");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) '#', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test13");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test14");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test15");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test16");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test17");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test18");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate(charSequence3, 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test19");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.Class<?> wildcardClass1 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test20");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str3 = unicodeUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper1, unicodeUnescaper4 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test21");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", 100, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test22");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test23");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", (int) ' ', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test24");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str4 = unicodeUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper2, unicodeUnescaper5 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper1.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
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
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test25");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str3 = unicodeUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper1, unicodeUnescaper4 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslatorArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test26");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test27");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test28");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test29");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test30");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test31");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str4 = unicodeUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper2, unicodeUnescaper5 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper1.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
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
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test32");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str3 = unicodeUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper1, unicodeUnescaper4 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test33");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test34");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test35");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test36");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test37");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test38");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test39");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test40");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test41");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str3 = unicodeUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper1, unicodeUnescaper4 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
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
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test42");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test43");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass3 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "64" + "'", str2.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test44");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", (int) '#', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test45");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str3 = unicodeUnescaper1.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper1, unicodeUnescaper4 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "A" + "'", str3.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test46");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test47");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test48");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test49");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test50");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test51");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.CharSequence charSequence1 = null;
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate(charSequence1, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test52");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "64" + "'", str2.equals("64"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test53");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test54");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test55");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "64" + "'", str2.equals("64"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test56");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test57");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test58");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test59");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test60");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test61");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate(charSequence5, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test62");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test63");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str4 = unicodeUnescaper2.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper2, unicodeUnescaper5 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper1.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
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
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test64");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test65");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.test66");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }
}

