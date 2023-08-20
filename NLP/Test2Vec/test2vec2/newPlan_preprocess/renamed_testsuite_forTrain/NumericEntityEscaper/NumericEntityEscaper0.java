
package NumericEntityEscaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumericEntityEscaper0 {

    public static boolean debug = false;

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test001");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test002");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test003");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test004");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test005");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test006");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test007");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test008");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test009");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test010");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test011");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = numericEntityEscaper0.translate((int) (short) 0, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test012");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test013");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test014");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.lang.Class<?> wildcardClass1 = numericEntityEscaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test015");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test016");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test017");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test018");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test019");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test020");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test021");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test022");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test023");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test024");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test025");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test026");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test027");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test028");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test029");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test030");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) ' ');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test031");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test032");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test033");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test034");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test035");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test036");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test037");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test038");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) ' ');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test039");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) -1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test040");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test041");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test042");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test043");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.lang.CharSequence charSequence2 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test044");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test045");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test046");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test047");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test048");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test049");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test050");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test051");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test052");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test053");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) ' ');
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test054");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test055");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test056");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test057");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test058");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) -1);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test059");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test060");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test061");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test062");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test063");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test064");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test065");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test066");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test067");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test068");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = numericEntityEscaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) ' ', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test069");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test070");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test071");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test072");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test073");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test074");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test075");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test076");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test077");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test078");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test079");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test080");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test081");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test082");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test083");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test084");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test085");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test086");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test087");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test088");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test089");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test090");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test091");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test092");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test093");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test094");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test095");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test096");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test097");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test098");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test099");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test100");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test101");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test102");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test103");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test104");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test105");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test106");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test107");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test108");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test109");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test110");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test111");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test112");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test113");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test114");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test115");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test116");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", 0, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test117");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test118");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(100);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test119");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) -1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test120");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test121");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test122");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test123");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test124");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test125");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test126");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test127");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.lang.String str6 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test128");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test129");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test130");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(1);
        java.io.Writer writer4 = null;
        int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test131");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test132");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test133");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test134");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test135");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test136");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test137");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test138");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test139");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test140");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test141");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test142");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test143");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test144");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test145");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test146");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test147");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test148");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test149");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test150");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) (short) 10, writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test151");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#48;" + "'", str4.equals("&#50;&#48;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test152");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (-1));
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test153");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test154");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test155");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test156");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test157");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test158");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test159");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test160");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test161");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test162");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test163");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#51;&#52;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;" + "'", str3.equals("&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test164");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test165");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test166");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test167");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (-1));
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test168");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test169");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test170");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test171");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test172");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "34");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test173");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test174");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test175");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test176");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test177");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test178");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate(0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test179");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test180");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test181");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test182");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test183");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test184");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test185");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test186");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test187");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test188");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test189");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, (int) (short) 100);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test190");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test191");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test192");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test193");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test194");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test195");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test196");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test197");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test198");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test199");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test200");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test201");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test202");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test203");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test204");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test205");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34", (int) (byte) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test206");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#51;&#52;" + "'", str4.equals("&#51;&#52;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test207");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test208");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test209");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test210");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test211");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = numericEntityEscaper0.translate(100, writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test212");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test213");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test214");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test215");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 0, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test216");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test217");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test218");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test219");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test220");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test221");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test222");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test223");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test224");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) '4');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test225");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test226");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test227");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test228");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test229");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test230");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test231");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test232");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test233");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test234");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test235");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test236");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test237");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test238");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test239");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) ' ');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test240");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test241");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test242");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test243");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test244");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test245");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#51;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#51;" + "'", str4.equals("&#50;&#51;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test246");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) ' ');
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test247");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test248");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test249");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test250");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test251");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test252");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test253");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test254");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test255");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test256");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test257");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test258");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test259");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test260");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test261");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test262");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test263");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test264");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test265");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test266");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test267");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test268");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test269");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test270");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test271");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test272");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test273");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test274");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;", (int) (short) 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test275");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test276");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test277");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test278");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test279");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test280");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test281");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test282");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (byte) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test283");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) (short) 10, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test284");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test285");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test286");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test287");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (short) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test288");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(0, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test289");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test290");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test291");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test292");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test293");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test294");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test295");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test296");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test297");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test298");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test299");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test300");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test301");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test302");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test303");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test304");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test305");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test306");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test307");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#&#53;0&#59;&#4&#56;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#38;&#35;&#53;&#51;&#59;&#48;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#38;&#35;&#53;&#51;&#59;&#48;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test308");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test309");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test310");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (short) 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#48;" + "'", str4.equals("&#50;&#48;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test311");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test312");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test313");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#38;&#35;&#53;&#51;&#59;&#48;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test314");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test315");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test316");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test317");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (-1));
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#48;" + "'", str4.equals("&#50;&#48;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test318");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test319");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test320");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test321");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test322");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test323");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test324");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) 'a', writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test325");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test326");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test327");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test328");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test329");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) (short) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test330");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#51;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#51;" + "'", str4.equals("&#50;&#51;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test331");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test332");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test333");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test334");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test335");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test336");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test337");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test338");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test339");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test340");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) '4');
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (byte) 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test341");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test342");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) -1, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test343");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test344");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test345");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test346");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test347");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test348");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test349");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test350");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test351");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test352");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test353");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test354");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test355");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test356");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test357");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test358");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test359");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test360");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 100);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test361");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test362");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, (int) 'a');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test363");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test364");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) 'a', writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test365");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) -1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;", (int) '4', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test366");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test367");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test368");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test369");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test370");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((-1), writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test371");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test372");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test373");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test374");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test375");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '4', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test376");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test377");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test378");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test379");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test380");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test381");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) 'a');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test382");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test383");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test384");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test385");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test386");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str3.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test387");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test388");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test389");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test390");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test391");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) '4');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test392");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test393");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (byte) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test394");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test395");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) 'a', writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test396");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test397");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test398");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test399");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test400");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test401");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test402");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test403");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test404");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test405");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test406");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test407");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test408");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test409");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test410");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test411");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test412");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (byte) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test413");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test414");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((-1));
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str3.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test415");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test416");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) ' ');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test417");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test418");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test419");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test420");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (short) 1);
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = numericEntityEscaper2.translate(charSequence3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test421");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test422");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) -1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test423");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 10);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) (short) 10, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test424");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test425");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test426");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test427");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test428");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test429");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) ' ');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test430");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test431");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test432");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test433");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test434");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test435");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (short) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;" + "'", str4.equals("&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test436");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#&#53;0&#59;&#4&#56;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#&#53;0&#59;&#4&#56;&#59;" + "'", str4.equals("&#&#53;0&#59;&#4&#56;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test437");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test438");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test439");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test440");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test441");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test442");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.CharSequence charSequence4 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test443");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test444");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test445");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test446");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "23");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test447");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test448");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test449");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test450");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test451");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test452");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test453");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test454");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) 'a', 10);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test455");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test456");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test457");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test458");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test459");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test460");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test461");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test462");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;" + "'", str4.equals("&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test463");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test464");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer2 = null;
        boolean boolean3 = numericEntityEscaper0.translate((-1), writer2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test465");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (int) '4');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test466");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;" + "'", str4.equals("&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test467");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test468");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test469");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) '#');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test470");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test471");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test472");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test473");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test474");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test475");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test476");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test477");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test478");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test479");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test480");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test481");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test482");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test483");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test484");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test485");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test486");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test487");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test488");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test489");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test490");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test491");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test492");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test493");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test494");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test495");
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test496");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test497");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test498");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
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
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test499");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test500");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (-1));
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
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

