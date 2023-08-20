
package UnicodeEscaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnicodeEscaper0 {

    public static boolean debug = false;

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test001");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test002");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test003");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test004");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test005");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test006");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test007");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test009");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test010");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test011");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unicodeEscaper0.translate((int) (short) 0, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test012");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test013");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test014");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test015");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.Class<?> wildcardClass1 = unicodeEscaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test016");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test017");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test018");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test019");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test020");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test021");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test022");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test023");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test024");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test025");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test026");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test027");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test028");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test029");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test030");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test031");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test032");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test033");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test034");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test035");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test036");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test037");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test038");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test039");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test040");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test041");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test042");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) -1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test043");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test044");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test045");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test046");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test047");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test048");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test049");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test050");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test051");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test052");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test053");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test054");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test055");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test056");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test057");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test058");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) ' ');
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test059");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test060");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test061");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test062");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test063");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test064");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test065");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test066");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test067");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test068");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test069");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "A", (int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test070");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test071");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test072");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test073");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test074");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test075");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeEscaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) ' ', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test076");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test077");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021" + "'", str4.equals("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test078");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test079");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test080");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test081");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test082");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test083");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test084");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test085");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test086");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test087");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test088");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test089");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test090");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test091");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test092");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test093");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test094");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test095");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test096");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test097");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test098");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test099");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test100");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (-1));
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021" + "'", str4.equals("\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test101");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test102");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test103");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test104");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test105");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test106");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test107");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test108");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test109");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test110");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test111");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test112");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test113");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test114");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test115");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test116");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test117");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test118");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test119");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test120");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test121");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test122");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test123");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test124");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test125");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test126");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test127");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) -1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test128");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test129");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test130");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test131");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test132");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test133");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test134");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test135");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test136");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test137");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test138");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test139");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(1);
        java.io.Writer writer4 = null;
        int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!", 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test140");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test141");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test142");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test143");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test144");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test145");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test146");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test147");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test148");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test149");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test150");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test151");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test152");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test153");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test154");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) '4');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test155");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test156");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0036\\u0031" + "'", str4.equals("\\u0036\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test157");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test158");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test159");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test160");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test161");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test162");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test163");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test164");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test165");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test166");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test167");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test168");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test169");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test170");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test171");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test172");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test173");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test174");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test175");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test176");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test177");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test178");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, 1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021", (int) (short) 10, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test179");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test180");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test181");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test182");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test183");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test184");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test185");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test186");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test187");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test188");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test189");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test190");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test191");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test192");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test193");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test194");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test195");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = unicodeEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test196");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test197");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test198");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test199");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test200");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test201");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test202");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test203");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test204");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test205");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test206");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", (int) (byte) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test207");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test208");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test209");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test210");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test211");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = unicodeEscaper0.translate(100, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test212");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test213");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test214");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test215");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test216");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test217");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test218");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test219");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test220");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "64", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test221");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test222");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test223");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test224");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test225");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test226");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) '4');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test227");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test228");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test229");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test230");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test231");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test232");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test233");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test234");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test235");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test236");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test237");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test238");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test239");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test240");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test241");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test242");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) ' ');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test243");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test244");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test245");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test246");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test247");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test248");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test249");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) -1, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test250");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test251");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (-1));
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test252");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0033\\u0034" + "'", str4.equals("\\u0033\\u0034"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test253");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate(1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test254");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test255");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test256");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test257");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test258");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test259");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test260");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test261");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test262");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test263");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test264");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test265");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test266");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test267");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test268");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test269");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test270");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test271");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 10);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031" + "'", str3.equals("\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test272");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test273");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "0", (int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test274");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test275");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test276");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test277");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test278");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test279");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test280");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test281");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test282");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (byte) 1, writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test283");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (short) 100, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test284");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test285");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test286");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4.equals("\\u0068\\u0069\\u0021"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test287");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0033\\u0034");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test288");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test289");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test290");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test291");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test292");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test293");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) 'a', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test294");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test295");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test296");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) ' ');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test297");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) (byte) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test298");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0036\\u0031" + "'", str4.equals("\\u0036\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test299");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test300");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test301");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test302");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test303");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test304");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test305");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test306");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test307");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test308");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test309");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test310");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test311");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (-1));
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test312");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test313");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test314");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test315");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test316");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test317");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test318");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test319");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test320");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test321");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test322");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test323");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test324");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test325");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test326");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 0);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test327");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test328");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test329");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test330");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test331");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test332");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test333");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test334");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test335");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 10, writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test336");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test337");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test338");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test339");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test340");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test341");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test342");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test343");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test344");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test345");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test346");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test347");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test348");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test349");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test350");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test351");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test352");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test353");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test354");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test355");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test356");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test357");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test358");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test359");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test360");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test361");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test362");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test363");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (-1));
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", (int) ' ', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test364");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test365");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test366");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test367");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test368");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test369");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test370");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0033\\u0034");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test371");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test372");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test373");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test374");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test375");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test376");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test377");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test378");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate(10, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test379");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test380");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test381");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test382");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test383");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test384");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test385");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.lang.String str2 = unicodeEscaper0.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str2.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test386");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test387");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test388");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test389");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test390");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test391");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test392");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test393");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test394");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test395");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test396");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test397");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test398");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 1);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = unicodeEscaper2.translate(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test399");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test400");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "34", (int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test401");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test402");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (short) 10, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test403");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) '4');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test404");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test405");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test406");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test407");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test408");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test409");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) ' ', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test410");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) 'a', 100);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test411");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test412");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test413");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test414");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test415");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test416");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 100, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test417");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test418");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test419");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '4', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test420");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test421");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test422");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test423");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test424");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test425");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test426");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test427");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test428");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test429");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (-1));
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test430");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test431");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test432");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test433");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test434");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test435");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test436");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test437");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) '4');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test438");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test439");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test440");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test441");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) '4');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test442");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test443");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test444");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test445");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test446");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test447");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test448");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test449");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test450");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test451");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test452");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', 0);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!", (int) '4', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test453");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test454");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test455");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test456");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test457");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test458");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test459");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test460");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) '#');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test461");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test462");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test463");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test464");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((-1));
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str3.equals("\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test465");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test466");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test467");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test468");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test469");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test470");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(0);
        java.lang.CharSequence charSequence2 = null;
        java.lang.String str3 = unicodeEscaper1.translate(charSequence2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test471");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test472");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) '#');
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test473");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test474");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 10, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test475");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test476");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test477");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test478");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '#', 1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750038\\\\u0075005C\\u0075\\\\u00750030\\\\u00750030\\\\u00750036\\\\u00750039\\\\u00750021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0038\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0030\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0039\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test479");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test480");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test481");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) (byte) 0, writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test482");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test483");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test484");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test485");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test486");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test487");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test488");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) '4');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "6\\u0034" + "'", str4.equals("6\\u0034"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test489");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test490");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031" + "'", str3.equals("\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test491");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test492");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test493");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test494");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(10, (int) (byte) 1);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test495");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test496");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((-1));
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test497");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test498");
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
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test499");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test500");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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

