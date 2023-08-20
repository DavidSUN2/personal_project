package NumericEntityEscaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumericEntityEscaper0 {

    public static boolean debug = false;

    @Test
    public void NumericEntityEscaper001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper001");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "hi!", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void NumericEntityEscaper002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper002");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper003");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper004");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper005");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper006");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = numericEntityEscaper2.translate(0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityEscaper007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper007");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityEscaper009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper009");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper010");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper011");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean3 = numericEntityEscaper0.translate((int) (short) 0, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumericEntityEscaper012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper012");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper013");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (byte) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper014");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.lang.Class<?> wildcardClass1 = numericEntityEscaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityEscaper015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper015");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "", (int) (short) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper016");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "", (int) (short) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper017");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void NumericEntityEscaper018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper018");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!", 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper019");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper020");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper021");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityEscaper022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper022");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityEscaper6.with(charSequenceTranslatorArray7);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityEscaper2.with(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityEscaper023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper023");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper5 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityEscaper1.with(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
    }

    @Test
    public void NumericEntityEscaper024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper024");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "0", 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper025");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            charSequenceTranslator3.translate((java.lang.CharSequence) "A", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
    }

    @Test
    public void NumericEntityEscaper026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper026");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "hi!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper027");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper1.translate((java.lang.CharSequence) "61", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper028");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper029");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper030");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper031");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper032");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper033");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "A", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
    }

    @Test
    public void NumericEntityEscaper034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper034");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityEscaper035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper035");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "hi!", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper036");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper037");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityEscaper038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper038");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) ' ');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper039");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) -1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate(charSequence2, (int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper040");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper041");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) ' ', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper042");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "1", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper043");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate(charSequence2, (int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper044");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper045");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
    }

    @Test
    public void NumericEntityEscaper046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper046");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.lang.String str6 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper047");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 100);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str9.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper048");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "1", (int) (byte) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper049");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper050");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper051");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void NumericEntityEscaper052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper052");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 0, writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper053");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) ' ');
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper054");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityEscaper055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper055");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper056");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "0", (int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper057");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper058");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper059");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper060");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void NumericEntityEscaper061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper061");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void NumericEntityEscaper062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper062");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "34", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void NumericEntityEscaper063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper063");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean4 = numericEntityEscaper1.translate((int) (short) 100, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper064");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityEscaper065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper065");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper066");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper067");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityEscaper068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper068");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int4 = numericEntityEscaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) ' ', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumericEntityEscaper069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper069");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void NumericEntityEscaper070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper070");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper071");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "20", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper072");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper073");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper074");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper075");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper076");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper077");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper078");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) '#', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper079");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper080");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (short) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void NumericEntityEscaper081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper081");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper082");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper083");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper084");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34", 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper085");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass8 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FFFFFFFF" + "'", str7.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityEscaper086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper086");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "23", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper087");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper088");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#51;&#52;" + "'", str4.equals("&#51;&#52;"));
    }

    @Test
    public void NumericEntityEscaper089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper089");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper090");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper091");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper092");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int9 = numericEntityEscaper1.translate((java.lang.CharSequence) "A", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void NumericEntityEscaper093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper093");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#51;&#52;" + "'", str4.equals("&#51;&#52;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str6.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper094");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper095");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper096");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        boolean boolean9 = numericEntityEscaper2.translate(10, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityEscaper097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper097");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper098");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper099");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityEscaper100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper100");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper5 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityEscaper3.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityEscaper1.with(charSequenceTranslatorArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper5);
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
    public void NumericEntityEscaper101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper101");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper102");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass4 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityEscaper103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper103");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper104");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper105");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
    }

    @Test
    public void NumericEntityEscaper106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper106");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void NumericEntityEscaper107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper107");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass4 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#104;&#105;&#33;" + "'", str3.equals("&#104;&#105;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityEscaper108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper108");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "1", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper109");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper110");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper111");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "61", (int) ' ', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper112");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) (byte) 100, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = numericEntityEscaper1.translate((int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityEscaper113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper113");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper114");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate(1, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityEscaper115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper115");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper116");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate(charSequence7, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper117");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper1.translate((int) (short) -1, writer6);
        java.lang.String str9 = numericEntityEscaper1.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void NumericEntityEscaper118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper118");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(100);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper119");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) -1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean4 = numericEntityEscaper1.translate((int) (short) 0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper120");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper121");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;&#33;", (int) (short) 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!" + "'", str4.equals("&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!"));
    }

    @Test
    public void NumericEntityEscaper122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper122");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper123");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityEscaper124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper124");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "", (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper125");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "34", (int) (short) 1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#104;&#105;&#33;" + "'", str3.equals("&#104;&#105;&#33;"));
    }

    @Test
    public void NumericEntityEscaper126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper126");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper127");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.lang.String str6 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper128");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper129");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityEscaper6.with(charSequenceTranslatorArray7);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityEscaper1.with(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityEscaper130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper130");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(1);
        java.io.Writer writer4 = null;
        int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void NumericEntityEscaper131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper131");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper2.translate(0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityEscaper132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper132");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) ' ', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper133");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper134");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper135");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void NumericEntityEscaper136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper136");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper137");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper138");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper139");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper140");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper141");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper142");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper143");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper144");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper1.translate((int) (short) -1, writer6);
        java.lang.Class<?> wildcardClass8 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityEscaper145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper145");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "23", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper146");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper147");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!", (int) ' ', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper148");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityEscaper149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper149");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean6 = numericEntityEscaper1.translate((-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str3.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper150");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) (short) 10, writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper151");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#48;" + "'", str4.equals("&#50;&#48;"));
    }

    @Test
    public void NumericEntityEscaper152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper152");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (-1));
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper153");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper154");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) (byte) 100, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper155");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper156");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void NumericEntityEscaper157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper157");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper158");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper159");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void NumericEntityEscaper160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper160");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper161");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", (int) 'a', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper162");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate((int) 'a', writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityEscaper163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper163");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#51;&#52;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;" + "'", str3.equals("&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;"));
    }

    @Test
    public void NumericEntityEscaper164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper164");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper165");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper166");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper167");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (-1));
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper168");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean7 = numericEntityEscaper2.translate((int) 'a', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#51;&#52;" + "'", str4.equals("&#51;&#52;"));
    }

    @Test
    public void NumericEntityEscaper169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper169");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "1", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper170");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper171");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper172");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "0", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#51;&#52;" + "'", str3.equals("&#51;&#52;"));
    }

    @Test
    public void NumericEntityEscaper173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper173");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper174");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper175");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "61", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper176");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", (int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper177");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) (short) 100, writer5);
        java.lang.String str8 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str8.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper178");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate(0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean9 = numericEntityEscaper1.translate((-1), writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityEscaper179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper179");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper180");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper181");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper182");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void NumericEntityEscaper183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper183");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean6 = numericEntityEscaper1.translate((int) (short) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#104;&#105;&#33;" + "'", str3.equals("&#104;&#105;&#33;"));
    }

    @Test
    public void NumericEntityEscaper184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper184");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper185");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper186");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 100);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str9.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper187");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper188");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper189");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper190");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper191");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper192");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((-1));
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) (byte) 0, writer3);
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper193");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "A" + "'", str7.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str9.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper194");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "61", (-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
    }

    @Test
    public void NumericEntityEscaper195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper195");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "&#51;&#52;" + "'", str7.equals("&#51;&#52;"));
    }

    @Test
    public void NumericEntityEscaper196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper196");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "0", 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper197");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "61", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper198");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate(charSequence3, (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper199");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper200");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer4 = null;
        int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (short) 10, writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper201");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper202");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper203");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper204");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 100);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "&#51;&#52;" + "'", str9.equals("&#51;&#52;"));
    }

    @Test
    public void NumericEntityEscaper205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper205");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34", (int) (byte) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper206");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#51;&#52;" + "'", str4.equals("&#51;&#52;"));
    }

    @Test
    public void NumericEntityEscaper207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper207");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void NumericEntityEscaper208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper208");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "0", (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper209");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = numericEntityEscaper2.with(charSequenceTranslatorArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper210");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper211");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean3 = numericEntityEscaper0.translate(100, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumericEntityEscaper212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper212");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "23", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper213");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper214");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper215");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 0, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) '4', writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper216");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass8 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
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
    public void NumericEntityEscaper217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper217");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper218");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper219");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) (short) 10, writer3);
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper220");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper221");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#50;&#51;" + "'", str6.equals("&#50;&#51;"));
    }

    @Test
    public void NumericEntityEscaper222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper222");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) (short) 0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;&#33;" + "'", str4.equals("&#104;&#105;&#33;"));
    }

    @Test
    public void NumericEntityEscaper223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper223");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "20", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper224");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) '4');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "23", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper225");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer7 = null;
        int int8 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#50;&#51;", (int) (short) 1, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void NumericEntityEscaper226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper226");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper227");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper228");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper229");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper230");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper231");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper232");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#51;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper233");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) 'a', writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper2.translate((int) (byte) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityEscaper234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper234");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper235");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = charSequenceTranslator7.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
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
    public void NumericEntityEscaper236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper236");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper237");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean4 = numericEntityEscaper1.translate((int) (short) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper238");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper239");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) ' ');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper240");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper241");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper242");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((-1), writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper2.translate(100, writer7);
        java.lang.Class<?> wildcardClass9 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityEscaper243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper243");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) -1, writer4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#51;&#59;", (int) (byte) 100, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityEscaper244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper244");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper245");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#51;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#51;" + "'", str4.equals("&#50;&#51;"));
    }

    @Test
    public void NumericEntityEscaper246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper246");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper247");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) '4');
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str9.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper248");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper249");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 10);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "A", (int) (short) 0, writer5);
        java.lang.String str8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "&#104;&#105;!" + "'", str8.equals("&#104;&#105;!"));
    }

    @Test
    public void NumericEntityEscaper250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper250");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "hi!", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper251");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper252");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper253");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper254");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper255");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "23", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper256");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "23", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper257");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "A", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper258");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper259");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper260");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate((int) (byte) 0, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityEscaper261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper261");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#65;", (int) (short) 10, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper262");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper263");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!", (int) (short) 0, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper264");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper265");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate(0, writer5);
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper266");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64", 0, writer5);
        java.io.Writer writer8 = null;
        boolean boolean9 = numericEntityEscaper2.translate((int) (byte) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityEscaper267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper267");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper268");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(1, writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper1.translate((int) '4', writer6);
        java.lang.String str9 = numericEntityEscaper1.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityEscaper269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper269");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;" + "'", str6.equals("&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;"));
    }

    @Test
    public void NumericEntityEscaper270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper270");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "", (int) (byte) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper271");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityEscaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper1.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass7 = charSequenceTranslator6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper3);
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
    public void NumericEntityEscaper272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper272");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper273");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper274");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;", (int) (short) 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper275");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper276");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityEscaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper1.with(charSequenceTranslatorArray4);
        java.io.Writer writer8 = null;
        boolean boolean9 = numericEntityEscaper1.translate((int) (byte) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityEscaper277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper277");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
    }

    @Test
    public void NumericEntityEscaper278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper278");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper279");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper280");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.lang.String str6 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#65;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "&#65;" + "'", str8.equals("&#65;"));
    }

    @Test
    public void NumericEntityEscaper281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper281");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "34", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper282");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "A", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper283");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) (short) 10, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper284");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper285");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper286");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "A", (int) (short) 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void NumericEntityEscaper287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper287");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (short) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper288");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean7 = numericEntityEscaper1.translate((int) (byte) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper289");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper290");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper291");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper292");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper293");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper294");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper295");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper296");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "A", (int) (short) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper297");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper298");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper299");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper300");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper301");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;", (int) (short) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper302");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, (-1));
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper303");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper304");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper305");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "20", 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper306");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!" + "'", str7.equals("&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void NumericEntityEscaper307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper307");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#&#53;0&#59;&#4&#56;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#38;&#35;&#53;&#51;&#59;&#48;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#38;&#35;&#53;&#51;&#59;&#48;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper308");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;" + "'", str6.equals("&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;"));
    }

    @Test
    public void NumericEntityEscaper309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper309");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate(charSequence5, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper310");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (short) 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#48;" + "'", str4.equals("&#50;&#48;"));
    }

    @Test
    public void NumericEntityEscaper311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper311");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper312");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (short) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper313");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#38;&#35;&#53;&#51;&#59;&#48;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper314");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        int int9 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", (int) '#', writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityEscaper315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper315");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "23", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper316");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper317");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (-1));
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#48;" + "'", str4.equals("&#50;&#48;"));
    }

    @Test
    public void NumericEntityEscaper318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper318");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#51;", (int) (short) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper319");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper320");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean7 = numericEntityEscaper1.translate(100, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper321");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;" + "'", str6.equals("&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper322");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) '4');
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass8 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
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
    public void NumericEntityEscaper323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper323");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper324");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) 'a', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper325");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper326");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper327");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper328");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (byte) 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper329");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) (short) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper330");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#51;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#51;" + "'", str4.equals("&#50;&#51;"));
    }

    @Test
    public void NumericEntityEscaper331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper331");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper332");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate((int) (byte) 0, writer6);
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FFFFFFFF" + "'", str9.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper333");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper334");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        java.io.Writer writer7 = null;
        int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;", (int) ' ', writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;" + "'", str4.equals("&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void NumericEntityEscaper335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper335");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper336");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper337");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#65;", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;" + "'", str6.equals("&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;"));
    }

    @Test
    public void NumericEntityEscaper338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper338");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper339");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (short) 100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper340");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) '4');
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (byte) 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper341");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#&#53;0&#59;&#4&#56;&#59;", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper342");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) -1, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "1", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper343");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper344");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass4 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityEscaper345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper345");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 1);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = charSequenceTranslator7.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "34" + "'", str9.equals("34"));
    }

    @Test
    public void NumericEntityEscaper346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper346");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;" + "'", str4.equals("&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&&#35;38;&&#35;35;&&#35;49;&&#35;48;&&#35;52;&&#35;59;&&#35;38;&&#35;35;&&#35;49;&&#35;48;&&#35;53;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;51;&&#35;59;" + "'", str6.equals("&&#35;38;&&#35;35;&&#35;49;&&#35;48;&&#35;52;&&#35;59;&&#35;38;&&#35;35;&&#35;49;&&#35;48;&&#35;53;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;51;&&#35;59;"));
    }

    @Test
    public void NumericEntityEscaper347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper347");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) 'a', writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;" + "'", str7.equals("&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;"));
    }

    @Test
    public void NumericEntityEscaper348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper348");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;" + "'", str4.equals("&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;"));
    }

    @Test
    public void NumericEntityEscaper349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper349");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper350");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper351");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper352");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;49;&&#35;48;&&#35;52;&&#35;59;&&#35;38;&&#35;35;&&#35;49;&&#35;48;&&#35;53;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;51;&&#35;59;", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper353");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper354");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64", 0, writer5);
        java.lang.String str8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!" + "'", str8.equals("&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!"));
    }

    @Test
    public void NumericEntityEscaper355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper355");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        java.lang.Class<?> wildcardClass8 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str7.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityEscaper356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper356");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#&#53;0&#59;&#4&#56;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "&#&#53;0&#59;&#4&#56;&#59;" + "'", str5.equals("&#&#53;0&#59;&#4&#56;&#59;"));
    }

    @Test
    public void NumericEntityEscaper357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper357");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper358");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper359");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) '#', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityEscaper360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper360");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper361");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper362");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper363");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 1, writer4);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityEscaper2.translate(charSequence6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void NumericEntityEscaper364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper364");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) 'a', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper365");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) -1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;", (int) '4', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper366");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "64", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;" + "'", str4.equals("&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void NumericEntityEscaper367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper367");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper368");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean4 = numericEntityEscaper1.translate((int) (byte) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper369");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper2.translate((int) (short) 10, writer7);
        java.lang.Class<?> wildcardClass9 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityEscaper370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper370");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#50;&#51;", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper371");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper372");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 100, writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper373");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate(charSequence5, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
    }

    @Test
    public void NumericEntityEscaper374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper374");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper375");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper376");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper377");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper378");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityEscaper379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper379");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper380");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper381");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper382");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "A", (int) (short) 10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper383");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper384");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper385");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "34", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
    }

    @Test
    public void NumericEntityEscaper386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper386");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str3.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper387");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 1);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass8 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper4);
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
    public void NumericEntityEscaper388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper388");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean7 = numericEntityEscaper2.translate((int) (short) 1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper389");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate((int) '#', writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityEscaper390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper390");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper391");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) '4');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper392");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;", writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper393");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;", (int) (short) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper394");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "23", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper395");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) 'a', writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper396");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper397");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) (short) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void NumericEntityEscaper398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper398");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "61" + "'", str7.equals("61"));
    }

    @Test
    public void NumericEntityEscaper399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper399");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", (-1), writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper400");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper401");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper402");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "34", (int) '4', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#54;&#49;" + "'", str3.equals("&#54;&#49;"));
    }

    @Test
    public void NumericEntityEscaper403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper403");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper404");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper405");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer4 = null;
        int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (short) 10, writer4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityEscaper1.translate((java.lang.CharSequence) "20", (int) (short) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void NumericEntityEscaper406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper406");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper407");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper408");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;", (int) '4', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper409");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper410");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void NumericEntityEscaper411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper411");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void NumericEntityEscaper412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper412");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "20", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper413");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer4 = null;
        int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (short) 10, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper1.translate(10, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityEscaper414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper414");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((-1));
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str3.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper415");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper416");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper417");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper418");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper419");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper420");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void NumericEntityEscaper421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper421");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper422");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate(charSequence3, (-1), writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper423");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) (short) 10, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper424");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper6 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = numericEntityEscaper6.with(charSequenceTranslatorArray7);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityEscaper2.with(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityEscaper425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper425");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper426");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper427");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper428");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (short) 1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper429");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate(1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper430");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void NumericEntityEscaper431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper431");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper432");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper433");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
    }

    @Test
    public void NumericEntityEscaper434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper434");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (byte) -1, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper435");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;" + "'", str4.equals("&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;"));
    }

    @Test
    public void NumericEntityEscaper436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper436");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#&#53;0&#59;&#4&#56;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#&#53;0&#59;&#4&#56;&#59;" + "'", str4.equals("&#&#53;0&#59;&#4&#56;&#59;"));
    }

    @Test
    public void NumericEntityEscaper437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper437");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper438");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper439");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "0", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper440");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 1, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper2.translate((-1), writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityEscaper441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper441");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 1, writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper442");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int7 = numericEntityEscaper1.translate(charSequence4, (int) '#', writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
    }

    @Test
    public void NumericEntityEscaper443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper443");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str5.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper444");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper445");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper446");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "23");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#54;&#49;", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "23" + "'", str4.equals("23"));
    }

    @Test
    public void NumericEntityEscaper447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper447");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 0, writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper448");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "hi!", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper449");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper450");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate(100, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper451");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper452");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) ' ', writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;" + "'", str7.equals("&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;"));
    }

    @Test
    public void NumericEntityEscaper453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper453");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper454");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 10);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate(charSequence3, (int) (byte) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper455");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper456");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper457");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper458");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper459");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper460");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper461");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper462");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;" + "'", str4.equals("&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;"));
    }

    @Test
    public void NumericEntityEscaper463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper463");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str6.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper464");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer2 = null;
        boolean boolean3 = numericEntityEscaper0.translate((-1), writer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void NumericEntityEscaper465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper465");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper466");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;" + "'", str4.equals("&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;"));
    }

    @Test
    public void NumericEntityEscaper467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper467");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper468");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper469");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#65;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper470");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper471");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '#', writer4);
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper472");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper473");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper474");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper475");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate((int) (byte) 100, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityEscaper476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper476");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper477");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper478");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;", (int) (short) 1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper479");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate((int) 'a', writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;" + "'", str4.equals("&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityEscaper480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper480");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "A", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper481");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper482");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper483");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper484");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (short) 1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", (int) (short) 0, writer5);
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper485");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper486");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "23", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper487");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#51;", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper488");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper489");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper490");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean4 = numericEntityEscaper1.translate((int) (byte) 10, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper491");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper492");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) (short) 0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper493");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper494");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer7 = null;
        int int8 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;", (int) '#', writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void NumericEntityEscaper495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper495");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 0, writer4);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityEscaper2.translate(charSequence6);
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str9.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper496");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            charSequenceTranslator3.translate((java.lang.CharSequence) "34", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
    }

    @Test
    public void NumericEntityEscaper497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper497");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper498");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean8 = numericEntityEscaper1.translate(0, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0" + "'", str5.equals("0"));
    }

    @Test
    public void NumericEntityEscaper499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper499");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.NumericEntityEscaper500");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate(10, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }
}

