package UnicodeEscaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnicodeEscaper0 {

    public static boolean debug = false;

    @Test
    public void UnicodeEscaper001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper001");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "hi!", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeEscaper002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper002");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeEscaper003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper003");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper004");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper005");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper006");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate(0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void UnicodeEscaper007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper007");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void UnicodeEscaper009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper009");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeEscaper010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper010");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper011");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean3 = unicodeEscaper0.translate((int) (short) 0, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeEscaper012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper012");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper013");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper014");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper015");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.Class<?> wildcardClass1 = unicodeEscaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void UnicodeEscaper016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper016");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "", (int) (short) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper017");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "", (int) (short) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper018");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void UnicodeEscaper019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper019");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper020");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeEscaper021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper021");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper022");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeEscaper023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper023");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeEscaper6.with(charSequenceTranslatorArray7);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper2.with(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void UnicodeEscaper024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper024");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeEscaper1.with(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
    }

    @Test
    public void UnicodeEscaper025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper025");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "0", 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper026");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            charSequenceTranslator3.translate((java.lang.CharSequence) "A", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
    }

    @Test
    public void UnicodeEscaper027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper027");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper028");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = unicodeEscaper2.translate(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void UnicodeEscaper029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper029");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper1.translate((java.lang.CharSequence) "61", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper031");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper032");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper033");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper035");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "A", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
    }

    @Test
    public void UnicodeEscaper036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper036");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeEscaper037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper037");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper038");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeEscaper039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper039");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeEscaper040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper040");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean4 = unicodeEscaper1.translate(0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper041");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper042");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) -1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate(charSequence2, (int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper043");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper044");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) ' ', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper045");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "1", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper046");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate(charSequence2, (int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper047");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper048");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
    }

    @Test
    public void UnicodeEscaper049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper049");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((int) (byte) 0, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void UnicodeEscaper050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper050");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper051");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021" + "'", str9.equals("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021"));
    }

    @Test
    public void UnicodeEscaper052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper052");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper053");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "1", (int) (byte) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper054");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper055");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021", 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper056");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void UnicodeEscaper057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper057");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        java.lang.Class<?> wildcardClass6 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void UnicodeEscaper058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper058");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper059");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeEscaper060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper060");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper061");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "0", (int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper062");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeEscaper063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper063");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper064");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper065");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void UnicodeEscaper066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper066");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void UnicodeEscaper067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper067");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "34", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void UnicodeEscaper068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper068");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (short) 100, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper069");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "A", (int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper070");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeEscaper071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper071");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper072");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper073");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeEscaper074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper074");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper075");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int4 = unicodeEscaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) ' ', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeEscaper076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper076");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void UnicodeEscaper077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper077");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021" + "'", str4.equals("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021"));
    }

    @Test
    public void UnicodeEscaper078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper078");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "20", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper079");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper080");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper081");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeEscaper082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper082");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper083");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper084");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper085");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) -1, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!" + "'", str7.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!"));
    }

    @Test
    public void UnicodeEscaper086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper086");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper087");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper088");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", (int) (short) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void UnicodeEscaper089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper089");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper090");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper091");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper092");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "34", 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper093");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) -1, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass8 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeEscaper094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper094");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper095");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper096");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void UnicodeEscaper097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper097");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper098");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper099");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.lang.Class<?> wildcardClass6 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void UnicodeEscaper100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper100");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021" + "'", str4.equals("\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021"));
    }

    @Test
    public void UnicodeEscaper101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper101");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int9 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0033\\u0034", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void UnicodeEscaper102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper102");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper103");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper104");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper105");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate(10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void UnicodeEscaper106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper106");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper107");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper108");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeEscaper109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper109");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper110");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper3 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper5 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeEscaper3.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper1.with(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void UnicodeEscaper111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper111");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper112");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper113");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass4 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void UnicodeEscaper114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper114");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper115");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeEscaper116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper116");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeEscaper117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper117");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str3.equals("\\u0068\\u0069\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void UnicodeEscaper118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper118");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "1", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper119");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u0033\\u0034", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper120");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "61", (int) ' ', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper121");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021");
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper1.translate((int) (byte) 100, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper1.translate((int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021" + "'", str3.equals("\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void UnicodeEscaper122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper122");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate(1, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void UnicodeEscaper123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper123");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper124");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate(charSequence7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper125");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper1.translate((int) (short) -1, writer6);
        java.lang.String str9 = unicodeEscaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void UnicodeEscaper126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper126");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper127");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) -1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (short) 0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper128");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper129");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", (int) (short) 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!"));
    }

    @Test
    public void UnicodeEscaper130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper130");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean4 = unicodeEscaper1.translate(0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper131");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeEscaper132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper132");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper133");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "34", (int) (short) 1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str3.equals("\\u0068\\u0069\\u0021"));
    }

    @Test
    public void UnicodeEscaper134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper134");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper135");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeEscaper136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper136");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper137");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper138");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(10, writer3);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeEscaper6.with(charSequenceTranslatorArray7);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper1.with(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void UnicodeEscaper139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper139");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(1);
        java.io.Writer writer4 = null;
        int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!", 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void UnicodeEscaper140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper140");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate(0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void UnicodeEscaper141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper141");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper142");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper143");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper144");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) ' ', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper145");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper146");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper147");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeEscaper148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper148");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper149");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper150");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper151");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!"));
    }

    @Test
    public void UnicodeEscaper152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper152");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper153");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "61", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper154");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper155");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper156");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0036\\u0031" + "'", str4.equals("\\u0036\\u0031"));
    }

    @Test
    public void UnicodeEscaper157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper157");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper158");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper159");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper1.translate((int) (short) 100, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper160");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper161");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper162");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper3 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = unicodeEscaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper1.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper3);
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
    public void UnicodeEscaper163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper163");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "34", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper164");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
    }

    @Test
    public void UnicodeEscaper165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper165");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper166");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "0", (int) 'a', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper167");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper168");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021");
        java.lang.String str8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4.equals("\\u0068\\u0069\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str8.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper169");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper170");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021" + "'", str8.equals("\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021"));
    }

    @Test
    public void UnicodeEscaper171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper171");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper172");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper173");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper174");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper175");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u0033\\u0034" + "'", str3.equals("\\u0033\\u0034"));
    }

    @Test
    public void UnicodeEscaper176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper176");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper177");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper178");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", (int) (short) 10, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper179");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021" + "'", str3.equals("\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021"));
    }

    @Test
    public void UnicodeEscaper180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper180");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
    }

    @Test
    public void UnicodeEscaper181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper181");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str6.equals("\\u0068\\u0069\\u0021"));
    }

    @Test
    public void UnicodeEscaper182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper182");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper183");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper184");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean6 = unicodeEscaper1.translate((int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str3.equals("\\u0068\\u0069\\u0021"));
    }

    @Test
    public void UnicodeEscaper185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper185");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper186");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper187");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031" + "'", str9.equals("\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper188");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper189");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper190");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper191");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "20", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper192");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void UnicodeEscaper193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper193");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((-1));
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (byte) 0, writer3);
        java.lang.Class<?> wildcardClass5 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper194");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "23");
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "23" + "'", str7.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str9.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper195");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0036\\u0031", (-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
    }

    @Test
    public void UnicodeEscaper196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper196");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\u0068\\u0069!" + "'", str7.equals("\\u0068\\u0069!"));
    }

    @Test
    public void UnicodeEscaper197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper197");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "61", 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper198");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "1", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper199");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate(charSequence3, (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper200");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper201");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer4 = null;
        int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069!", (int) (short) 10, writer4);
        java.lang.Class<?> wildcardClass6 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void UnicodeEscaper202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper202");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "34", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper203");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper204");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\u0033\\u0034" + "'", str9.equals("\\u0033\\u0034"));
    }

    @Test
    public void UnicodeEscaper205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper205");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0033\\u0034");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\u0033\\u0034" + "'", str5.equals("\\u0033\\u0034"));
    }

    @Test
    public void UnicodeEscaper206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper206");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", (int) (byte) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper207");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "34", (int) (byte) 0, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper2.translate(100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void UnicodeEscaper208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper208");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper209");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = unicodeEscaper2.with(charSequenceTranslatorArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper210");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper211");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean3 = unicodeEscaper0.translate(100, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeEscaper212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper212");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper213");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper214");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "61", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper215");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper216");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper217");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!", (int) '4', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper218");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass8 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeEscaper219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper219");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper220");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "64", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper221");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
    }

    @Test
    public void UnicodeEscaper222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper222");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 10, writer3);
        java.lang.Class<?> wildcardClass5 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper223");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper224");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", (int) (short) 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper225");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper226");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) '4');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u0036\\u0031", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper227");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) (short) 1, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeEscaper228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper228");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper229");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper230");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021" + "'", str4.equals("\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021"));
    }

    @Test
    public void UnicodeEscaper231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper231");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper232");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u0041" + "'", str6.equals("\\u0041"));
    }

    @Test
    public void UnicodeEscaper233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper233");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper234");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper235");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper236");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper237");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) (byte) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void UnicodeEscaper238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper238");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper239");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = charSequenceTranslator7.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void UnicodeEscaper240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper240");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (short) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper241");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper242");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) ' ');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper243");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper244");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeEscaper245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper245");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper246");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper247");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper248");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper249");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) -1, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021", (int) (byte) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper250");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021");
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4.equals("\\u0068\\u0069\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper251");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (-1));
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper252");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0033\\u0034" + "'", str4.equals("\\u0033\\u0034"));
    }

    @Test
    public void UnicodeEscaper253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper253");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper254");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper255");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((-1), writer6);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\\\u00750036\\\\u00750031" + "'", str4.equals("\\\\u00750036\\\\u00750031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0" + "'", str9.equals("0"));
    }

    @Test
    public void UnicodeEscaper256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper256");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper257");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper258");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper259");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper260");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper261");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper262");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper263");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\u0041" + "'", str7.equals("\\u0041"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "20" + "'", str9.equals("20"));
    }

    @Test
    public void UnicodeEscaper264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper264");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeEscaper265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper265");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper266");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper267");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper268");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper269");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0033\\u0034");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper270");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!", (int) (short) 10, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void UnicodeEscaper271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper271");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031" + "'", str3.equals("\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper272");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper273");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper274");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper275");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper276");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper277");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper278");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (-1), writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper279");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper280");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper281");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper282");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (byte) 1, writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper283");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 100, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper284");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper285");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper286");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4.equals("\\u0068\\u0069\\u0021"));
    }

    @Test
    public void UnicodeEscaper287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper287");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0033\\u0034");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034"));
    }

    @Test
    public void UnicodeEscaper288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper288");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper289");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper290");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper291");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper292");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper293");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper294");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = unicodeEscaper1.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "61" + "'", str8.equals("61"));
    }

    @Test
    public void UnicodeEscaper295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper295");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper296");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) ' ');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper297");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeEscaper298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper298");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0036\\u0031" + "'", str4.equals("\\u0036\\u0031"));
    }

    @Test
    public void UnicodeEscaper299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper299");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper300");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper301");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", (int) (short) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper302");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (byte) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void UnicodeEscaper303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper303");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (byte) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper304");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper305");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer5 = null;
        boolean boolean6 = unicodeEscaper1.translate((int) '4', writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper1.translate((int) (short) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void UnicodeEscaper306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper306");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "A", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper307");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper308");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper309");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper310");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper311");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (-1));
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper312");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
    }

    @Test
    public void UnicodeEscaper313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper313");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 100, writer4);
        java.io.Writer writer8 = null;
        int int9 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void UnicodeEscaper314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper314");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper315");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper316");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper317");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper318");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) '4');
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass8 = charSequenceTranslatorArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeEscaper319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper319");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper320");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0033\\u0034");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate(0, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void UnicodeEscaper321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper321");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper322");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper323");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper1.translate((int) '#', writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void UnicodeEscaper324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper324");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper325");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper326");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void UnicodeEscaper327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper327");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeEscaper328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper328");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031" + "'", str6.equals("\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper329");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper330");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4.equals("\\u0068\\u0069\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void UnicodeEscaper331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper331");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper332");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper333");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "34", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper334");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper335");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 10, writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper336");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 100);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0034\\u0033\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0034\\u0033\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0032\\u005Cu\\u0030\\u0030\\u0033\\u0031" + "'", str9.equals("\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0034\\u0033\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0034\\u0033\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0032\\u005Cu\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper337");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper338");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper339");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper340");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper341");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "34", (int) (short) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper342");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "hi!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper343");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper344");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper345");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper346");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper1.translate((int) (short) 10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void UnicodeEscaper347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper347");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034", (int) '#', writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeEscaper348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper348");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate(10, writer6);
        java.lang.Class<?> wildcardClass8 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021" + "'", str4.equals("\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeEscaper349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper349");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper350");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean7 = unicodeEscaper2.translate((int) 'a', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void UnicodeEscaper351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper351");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper352");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper353");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper354");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate(charSequence7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void UnicodeEscaper355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper355");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper6 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = unicodeEscaper6.with(charSequenceTranslatorArray7);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper2.with(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021" + "'", str4.equals("\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void UnicodeEscaper356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper356");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper357");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031" + "'", str7.equals("\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031"));
    }

    @Test
    public void UnicodeEscaper358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper358");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper359");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper360");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper361");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (short) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper362");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper363");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (-1));
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) ' ', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper364");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper365");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0032\\u0030", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper366");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((int) (short) 100, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void UnicodeEscaper367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper367");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031", (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper368");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper369");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "23", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper370");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0033\\u0034");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "61", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0034"));
    }

    @Test
    public void UnicodeEscaper371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper371");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper372");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper373");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper374");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper375");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper376");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\\\u00750068\\\\u00750069!" + "'", str4.equals("\\\\u00750068\\\\u00750069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper377");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper378");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(10, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper379");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper380");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper381");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper382");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper383");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) -1, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.lang.Class<?> wildcardClass8 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str7.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeEscaper384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper384");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper385");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str2.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper386");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper387");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper388");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", (int) (short) 10, writer5);
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper389");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(0, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper2.translate((int) ' ', writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void UnicodeEscaper390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper390");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper391");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper392");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper393");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper394");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper395");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper396");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper397");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper398");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 1);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void UnicodeEscaper399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper399");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper400");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "34", (int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper401");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper402");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 10, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper403");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) '4');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper404");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper405");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", 1, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeEscaper406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper406");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper407");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((int) (byte) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper408");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper409");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) ' ', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper410");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', 100);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper411");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper412");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper413");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate(0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper414");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper415");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0041", (int) (short) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper416");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper417");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
    }

    @Test
    public void UnicodeEscaper418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper418");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper419");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "61", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper420");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeEscaper421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper421");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031");
        java.lang.Class<?> wildcardClass4 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031" + "'", str3.equals("\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void UnicodeEscaper422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper422");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021"));
    }

    @Test
    public void UnicodeEscaper423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper423");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper424");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper425");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper426");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((int) 'a', writer6);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u0021" + "'", str9.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u0021"));
    }

    @Test
    public void UnicodeEscaper427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper427");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper428");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper429");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper430");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper431");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper432");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper433");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper434");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper435");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper436");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper437");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) '4');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u0033\\u0034", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper438");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        java.lang.Class<?> wildcardClass4 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str3.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void UnicodeEscaper439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper439");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "20", (int) (short) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper440");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper441");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) '4');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper442");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper443");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper444");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0032\\u0030" + "'", str4.equals("\\u0032\\u0030"));
    }

    @Test
    public void UnicodeEscaper445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper445");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper446");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0032\\u0030");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\u0032\\u0030" + "'", str7.equals("\\u0032\\u0030"));
    }

    @Test
    public void UnicodeEscaper447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper447");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", (-1), writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper448");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper449");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper450");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper451");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "61", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper452");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!", (int) '4', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper453");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750034\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750034\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper454");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper455");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) (short) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper456");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((int) (byte) -1, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0041" + "'", str4.equals("\\u0041"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void UnicodeEscaper457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper457");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper458");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper459");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper460");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper461");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper462");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(10, writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper1.translate(10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void UnicodeEscaper463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper463");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021");
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper1.translate(0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021" + "'", str3.equals("\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021" + "'", str5.equals("\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void UnicodeEscaper464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper464");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((-1));
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str3.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper465");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper466");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021", 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper467");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void UnicodeEscaper468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper468");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper469");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper470");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(0);
        java.lang.CharSequence charSequence2 = null;
        java.lang.String str3 = unicodeEscaper1.translate(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void UnicodeEscaper471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper471");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper472");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) '#');
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int5 = unicodeEscaper1.translate(charSequence2, (-1), writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper473");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper474");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper475");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
        java.lang.Class<?> wildcardClass8 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\u0041" + "'", str7.equals("\\u0041"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void UnicodeEscaper476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper476");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper477");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper478");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper479");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0033\\u0034", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper480");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper481");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (byte) 0, writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper482");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void UnicodeEscaper483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper483");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper484");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper485");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper486");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (-1));
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0033\\u0034");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0033\\u0034" + "'", str4.equals("\\u0033\\u0034"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper487");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0033\\u0034" + "'", str4.equals("\\u0033\\u0034"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper488");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) '4');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "6\\u0034" + "'", str4.equals("6\\u0034"));
    }

    @Test
    public void UnicodeEscaper489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper489");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper490");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031" + "'", str3.equals("\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031"));
    }

    @Test
    public void UnicodeEscaper491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper491");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper492");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper493");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper494");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (byte) 1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper495");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void UnicodeEscaper496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper496");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((-1));
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper497");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper498");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper499");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.UnicodeEscaper500");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in UnicodeEscaper generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }
}

