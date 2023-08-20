package UnicodeUnescaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnicodeUnescaper0 {

    public static boolean debug = false;

    @Test
    public void UnicodeUnescaper001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper001");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper002");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void UnicodeUnescaper003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper003");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeUnescaper004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper004");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper005");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper006");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper007");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) 'a', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper008");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeUnescaper009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper009");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeUnescaper010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper010");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void UnicodeUnescaper011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper011");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 10, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper012");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper013");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass3 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeUnescaper014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper014");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate(charSequence5, (int) (short) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper015");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper016");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper017");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate(charSequence3, (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper018");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass3 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeUnescaper019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper019");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeUnescaper020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper020");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslatorArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeUnescaper021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper021");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper022");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper023");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeUnescaper024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper024");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) '#', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper025");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper026");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (byte) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper027");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeUnescaper028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper028");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeUnescaper029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper029");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper030");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper031");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper032");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslator7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeUnescaper033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper033");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper034");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper035");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeUnescaper036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper036");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeUnescaper037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper037");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) ' ', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper038");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper039");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper040");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper041");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper042");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper043");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void UnicodeUnescaper044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper044");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.Class<?> wildcardClass1 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void UnicodeUnescaper045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper045");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper046");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (byte) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper047");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper048");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper049");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper050");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A", (int) '4', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper051");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "1");
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
    public void UnicodeUnescaper052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper052");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "", (int) (short) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper053");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper054");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper055");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper056");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void UnicodeUnescaper057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper057");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper058");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper059");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper060");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "23" + "'", str9.equals("23"));
    }

    @Test
    public void UnicodeUnescaper061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper061");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper062");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34", (int) (byte) 10, writer7);
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
    public void UnicodeUnescaper063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper063");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper064");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeUnescaper065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper065");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper066");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper067");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper068");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper069");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeUnescaper070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper070");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeUnescaper071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper071");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper072");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper073");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.Class<?> wildcardClass3 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeUnescaper074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper074");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper075");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper076");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void UnicodeUnescaper077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper077");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper078");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper079");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper080");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "0", writer6);
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
    public void UnicodeUnescaper081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper081");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper082");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper083");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper084");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer7);
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
    public void UnicodeUnescaper085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper085");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate(charSequence3, (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper086");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper087");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper088");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper089");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper090");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.Class<?> wildcardClass3 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeUnescaper091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper091");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper092");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "hi!", writer8);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper093");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.CharSequence charSequence8 = null;
        java.lang.String str9 = charSequenceTranslator7.translate(charSequence8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void UnicodeUnescaper094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper094");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.Class<?> wildcardClass3 = charSequenceTranslatorArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeUnescaper095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper095");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) '#', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper096");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper097");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper098");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34", 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper099");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void UnicodeUnescaper100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper100");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper101");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper102");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void UnicodeUnescaper103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper103");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper104");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.Class<?> wildcardClass5 = charSequenceTranslatorArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper105");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper106");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper107");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) 1, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper108");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper109");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper110");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 100, writer7);
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
    public void UnicodeUnescaper111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper111");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper112");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper113");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeUnescaper114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper114");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void UnicodeUnescaper115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper115");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "23", writer8);
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
    public void UnicodeUnescaper116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper116");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper117");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper118");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper119");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "", 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper120");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper121");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper122");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper123");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper124");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper125");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper126");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator6.translate(charSequence7, writer8);
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
    public void UnicodeUnescaper127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper127");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper128");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper129");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper130");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "34", writer8);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper131");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper132");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper133");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper134");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper135");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void UnicodeUnescaper136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper136");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void UnicodeUnescaper137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper137");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper138");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper139");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper140");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper141");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper142");
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
            charSequenceTranslator6.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper143");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer6);
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
    public void UnicodeUnescaper144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper144");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper145");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "20", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper146");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void UnicodeUnescaper147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper147");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = charSequenceTranslator4.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void UnicodeUnescaper148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper148");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper149");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "20", writer8);
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
    public void UnicodeUnescaper150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper150");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper151");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper152");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer6);
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
    public void UnicodeUnescaper153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper153");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper154");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper155");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator6.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper156");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper157");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper158");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void UnicodeUnescaper159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper159");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper160");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper161");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper162");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer6);
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
    public void UnicodeUnescaper163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper163");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper164");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", 1, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper165");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper166");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper167");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "", (int) (byte) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper168");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper169");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper170");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper171");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void UnicodeUnescaper172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper172");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper173");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper174");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper175");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) ' ', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper176");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper177");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) ' ', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper178");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper179");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer6);
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
    public void UnicodeUnescaper180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper180");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer6);
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
    public void UnicodeUnescaper181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper181");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper182");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper183");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper184");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper185");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper186");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper187");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper188");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void UnicodeUnescaper189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper189");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper190");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper191");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper192");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void UnicodeUnescaper193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper193");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void UnicodeUnescaper194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper194");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper195");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper196");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = charSequenceTranslator2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
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
    public void UnicodeUnescaper197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper197");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) ' ', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper198");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper199");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "", 100, writer7);
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
    public void UnicodeUnescaper200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper200");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", (int) (short) 100, writer7);
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
    public void UnicodeUnescaper201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper201");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper202");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) 'a', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper203");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper204");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper205");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper206");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator6.getClass();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper207");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper208");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper209");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper210");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
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
    public void UnicodeUnescaper211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper211");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper212");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper213");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper214");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper215");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslatorArray4.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper216");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void UnicodeUnescaper217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper217");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (byte) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void UnicodeUnescaper218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper218");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper219");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper220");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper221");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper222");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper223");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void UnicodeUnescaper224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper224");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void UnicodeUnescaper225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper225");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper226");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void UnicodeUnescaper227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper227");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
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
    public void UnicodeUnescaper228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper228");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper229");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void UnicodeUnescaper230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper230");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void UnicodeUnescaper231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper231");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "61" + "'", str9.equals("61"));
    }

    @Test
    public void UnicodeUnescaper232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper232");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper233");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper234");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = charSequenceTranslator2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
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
    public void UnicodeUnescaper235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper235");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
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
    public void UnicodeUnescaper236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper236");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper237");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer6);
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
    public void UnicodeUnescaper238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper238");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "", (int) '#', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void UnicodeUnescaper239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper239");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper240");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper241");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper242");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper243");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper244");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper245");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
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
    public void UnicodeUnescaper246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper246");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void UnicodeUnescaper247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper247");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper248");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper249");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper250");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper251");
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
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void UnicodeUnescaper252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper252");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void UnicodeUnescaper253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper253");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper254");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", (int) 'a', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper255");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper256");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) (short) 100, writer7);
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
    public void UnicodeUnescaper257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper257");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper258");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper259");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper260");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper261");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper262");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper263");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper264");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void UnicodeUnescaper265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper265");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void UnicodeUnescaper266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper266");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper267");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper5 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
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
    public void UnicodeUnescaper268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper268");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper269");
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
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper270");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer6);
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
    public void UnicodeUnescaper271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper271");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = charSequenceTranslator2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
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
    public void UnicodeUnescaper272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper272");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "23");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper273");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void UnicodeUnescaper274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper274");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", (int) (byte) 1, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper275");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper276");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper277");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
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
    public void UnicodeUnescaper278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper278");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void UnicodeUnescaper279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper279");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper280");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper281");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper282");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper283");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void UnicodeUnescaper284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper284");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper285");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void UnicodeUnescaper286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper286");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper287");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper288");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper289");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper290");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper291");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper292");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "20", writer8);
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
    public void UnicodeUnescaper293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper293");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper294");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper295");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
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
    public void UnicodeUnescaper296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper296");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper297");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper298");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper299");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper300");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer6);
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
    public void UnicodeUnescaper301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper301");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslatorArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper302");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper303");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper304");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.Class<?> wildcardClass5 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper305");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper306");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper307");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper308");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper309");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper310");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper311");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper312");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper313");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper314");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper315");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper316");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper317");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void UnicodeUnescaper318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper318");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper319");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void UnicodeUnescaper320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper320");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper321");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeUnescaper322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper322");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper323");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "23", writer8);
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
    public void UnicodeUnescaper324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper324");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper325");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void UnicodeUnescaper326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper326");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "20");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void UnicodeUnescaper327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper327");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper328");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper329");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void UnicodeUnescaper330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper330");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper331");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "61", writer6);
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
    public void UnicodeUnescaper332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper332");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper333");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper334");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper335");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper336");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void UnicodeUnescaper337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper337");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper338");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void UnicodeUnescaper339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper339");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void UnicodeUnescaper340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper340");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper341");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper342");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper343");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper344");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper345");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper346");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeUnescaper347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper347");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper348");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper349");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
    }

    @Test
    public void UnicodeUnescaper350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper350");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper351");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeUnescaper352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper352");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeUnescaper353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper353");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper354");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void UnicodeUnescaper355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper355");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) 'a', writer7);
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
    public void UnicodeUnescaper356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper356");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void UnicodeUnescaper357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper357");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper358");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeUnescaper359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper359");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper360");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper361");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper362");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper363");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper364");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", (int) (byte) 100, writer7);
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
    public void UnicodeUnescaper365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper365");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "61", writer6);
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
    public void UnicodeUnescaper366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper366");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void UnicodeUnescaper367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper367");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
    }

    @Test
    public void UnicodeUnescaper368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper368");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper369");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper370");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
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
    public void UnicodeUnescaper371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper371");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void UnicodeUnescaper372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper372");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper373");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper374");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper375");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void UnicodeUnescaper376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper376");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper377");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper378");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper379");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", (int) (byte) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper380");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void UnicodeUnescaper381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper381");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper382");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper383");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper384");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper385");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper386");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "1", writer8);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper387");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void UnicodeUnescaper388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper388");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper389");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper390");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper391");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void UnicodeUnescaper392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper392");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void UnicodeUnescaper393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper393");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper394");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "A", writer8);
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
    public void UnicodeUnescaper395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper395");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper396");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper397");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper398");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper399");
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
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void UnicodeUnescaper400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper400");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper401");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper402");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
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
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeUnescaper403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper403");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper404");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper405");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper406");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper407");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
    }

    @Test
    public void UnicodeUnescaper408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper408");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper409");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = charSequenceTranslator4.with(charSequenceTranslatorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
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
    public void UnicodeUnescaper410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper410");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A", (int) 'a', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeUnescaper411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper411");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void UnicodeUnescaper412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper412");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void UnicodeUnescaper413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper413");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void UnicodeUnescaper414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper414");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper415");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
    }

    @Test
    public void UnicodeUnescaper416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper416");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper417");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper418");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", (int) 'a', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper419");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
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
    public void UnicodeUnescaper420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper420");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
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
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void UnicodeUnescaper421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper421");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper422");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void UnicodeUnescaper423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper423");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void UnicodeUnescaper424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper424");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void UnicodeUnescaper425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper425");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper426");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeUnescaper0.translate(charSequence3);
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper427");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void UnicodeUnescaper428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper428");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "FFFFFFFF");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper429");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 0, writer7);
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
    public void UnicodeUnescaper430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper430");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass3 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeUnescaper431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper431");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void UnicodeUnescaper432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper432");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper433");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
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
    public void UnicodeUnescaper434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper434");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
    public void UnicodeUnescaper435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper435");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass5 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper436");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
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
    public void UnicodeUnescaper437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper437");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void UnicodeUnescaper438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper438");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper439");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper440");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void UnicodeUnescaper441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper441");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper442");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "A", writer6);
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
    public void UnicodeUnescaper443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper443");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper444");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper445");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "20", writer8);
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
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper446");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper447");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator6.translate((java.lang.CharSequence) "", writer8);
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
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void UnicodeUnescaper448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper448");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator2.translate((java.lang.CharSequence) "", writer6);
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
    public void UnicodeUnescaper449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper449");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
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
    public void UnicodeUnescaper450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper450");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper451");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper452");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeUnescaper453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper453");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) 'a', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper454");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void UnicodeUnescaper455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper455");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void UnicodeUnescaper456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper456");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeUnescaper457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper457");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
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
    public void UnicodeUnescaper458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper458");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper459");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper460");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
    }

    @Test
    public void UnicodeUnescaper461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper461");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void UnicodeUnescaper462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper462");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "1", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void UnicodeUnescaper463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper463");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            charSequenceTranslator4.translate((java.lang.CharSequence) "23", writer8);
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
    public void UnicodeUnescaper464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper464");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper465");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void UnicodeUnescaper466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper466");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = unicodeUnescaper0.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper467");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper468");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void UnicodeUnescaper469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper469");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper0.with(charSequenceTranslatorArray2);
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
    public void UnicodeUnescaper470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper470");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
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
    public void UnicodeUnescaper471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper471");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
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
    public void UnicodeUnescaper472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper472");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
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
    public void UnicodeUnescaper473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper473");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeUnescaper474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper474");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
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
    public void UnicodeUnescaper475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper475");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeUnescaper476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper476");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
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
    public void UnicodeUnescaper477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper477");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void UnicodeUnescaper478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper478");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
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
    public void UnicodeUnescaper479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper479");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper480");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "61", 100, writer7);
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
    public void UnicodeUnescaper481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper481");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) -1, writer7);
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
    public void UnicodeUnescaper482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper482");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
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
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper483");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass5 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeUnescaper484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper484");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.io.Writer writer3 = null;
        int int4 = unicodeUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        int int8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34", 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeUnescaper485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper485");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "34", writer6);
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
    public void UnicodeUnescaper486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper486");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper487");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper4 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper1.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = charSequenceTranslatorArray5.getClass();
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
    public void UnicodeUnescaper488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper488");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
    }

    @Test
    public void UnicodeUnescaper489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper489");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
    }

    @Test
    public void UnicodeUnescaper490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper490");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper491");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper492");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            int int6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void UnicodeUnescaper493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper493");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeUnescaper494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper494");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper495");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = unicodeUnescaper0.translate((java.lang.CharSequence) "64");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeUnescaper496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper496");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper3 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str5 = unicodeUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeUnescaper0.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = null;
        // The following exception was thrown during execution in UnicodeUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = charSequenceTranslator7.with(charSequenceTranslatorArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
    }

    @Test
    public void UnicodeUnescaper497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper497");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper1 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper2 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper498");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        java.lang.String str2 = unicodeUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void UnicodeUnescaper499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper499");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = unicodeUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = unicodeUnescaper0.translate(charSequence5);
        java.lang.String str8 = unicodeUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = unicodeUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void UnicodeUnescaper500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeUnescaper0.UnicodeUnescaper500");
        org.apache.commons.lang3.text.translate.UnicodeUnescaper unicodeUnescaper0 = new org.apache.commons.lang3.text.translate.UnicodeUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = unicodeUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

