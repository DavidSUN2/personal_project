
package NumericEntityEscaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumericEntityEscaper1 {

    public static boolean debug = false;

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test501");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test502");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test503");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', 1);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test504");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(100, writer3);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test505");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test506");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;", (int) ' ', writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test507");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test508");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "61");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) '4', writer5);
        java.lang.String str8 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "61" + "'", str3.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test509");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) '4');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", (-1), writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test510");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (-1));
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test511");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test512");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test513");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) ' ');
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test514");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = numericEntityEscaper1.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;", (int) (short) 100, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test515");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(100, writer3);
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper1.translate(10, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test516");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test517");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (short) 0);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test518");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test519");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "", 10, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test520");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test521");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = numericEntityEscaper2.translate((int) (byte) 10, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;" + "'", str4.equals("&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;" + "'", str6.equals("&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test522");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test523");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;", 10, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test524");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) (short) 100, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = numericEntityEscaper1.translate(0, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test525");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;", writer3);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test526");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test527");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) -1, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper2.translate((int) (byte) -1, writer7);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test528");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test529");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str5.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test530");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (-1));
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;", (int) (byte) 0, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test531");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;" + "'", str3.equals("&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test532");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "23");
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper1.translate(100, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test533");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) -1);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test534");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (short) -1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "20", (int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test535");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test536");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;", (int) (short) -1, writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test537");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = numericEntityEscaper2.translate((int) (byte) -1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test538");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;", (int) (byte) 10, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test539");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;", writer8);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test540");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (short) 0);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test541");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 100, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "34", 100, writer8);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test542");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, (-1));
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test543");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test544");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test545");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "0");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass6 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0" + "'", str3.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "64" + "'", str5.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test546");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "61", 10, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test547");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test548");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test549");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test550");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "A", writer6);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test551");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 100);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test552");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test553");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test554");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test555");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate(10, writer6);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test556");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 0);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test557");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;", (int) (short) 100, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test558");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test559");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityEscaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper1.with(charSequenceTranslatorArray4);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "FFFFFFFF");
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
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test560");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;", writer6);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test561");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test562");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate(charSequence3, 0, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test563");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test564");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) -1, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "A", 1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test565");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test566");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test567");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;" + "'", str4.equals("&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test568");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test569");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "23");
        java.lang.String str7 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#54;&#49;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "23" + "'", str5.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "&#54;&#49;" + "'", str7.equals("&#54;&#49;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test570");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#65;" + "'", str6.equals("&#65;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;" + "'", str8.equals("&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test571");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test572");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '4', 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test573");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test574");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;", (-1), writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test575");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test576");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test577");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#&#53;0&#59;&#4&#56;&#59;" + "'", str4.equals("&#&#53;0&#59;&#4&#56;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test578");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "23", 1, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test579");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "20", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test580");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test581");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test582");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test583");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test584");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (byte) 1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", 10, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test585");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (short) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "61", 100, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test586");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (-1));
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(100, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test587");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test588");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test589");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.lang.Class<?> wildcardClass9 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;" + "'", str6.equals("&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str8.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test590");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test591");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test592");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '#', writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test593");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#54;&#49;" + "'", str4.equals("&#54;&#49;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test594");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        java.io.Writer writer8 = null;
        int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;", 0, writer8);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test595");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#50;&#51;", 10, writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test596");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test597");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 100, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper2.translate((int) ' ', writer7);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test598");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test599");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test600");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test601");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test602");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", 100, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test603");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 0);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test604");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) (short) 100, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test605");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", (int) (byte) -1, writer8);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test606");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "20");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;" + "'", str6.equals("&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test607");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test608");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;&#33;" + "'", str4.equals("&#104;&#105;&#33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test609");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test610");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "34", (int) (byte) -1, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test611");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test612");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;65;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;65;" + "'", str4.equals("&#38;&#35;65;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test613");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test614");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;53;&&#35;48;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test615");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "", writer6);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test616");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test617");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test618");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test619");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (short) 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test620");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '4', (int) (short) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test621");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), 100);
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

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test622");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test623");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;", (int) ' ', writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test624");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test625");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test626");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test627");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (byte) 0, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;", (int) (short) -1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test628");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) (byte) 1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;", (int) ' ', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test629");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) 100);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test630");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test631");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) '4');
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 10, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test632");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test633");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test634");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (short) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;49;&&#35;48;&&#35;52;&&#35;59;&&#35;38;&&#35;35;&&#35;49;&&#35;48;&&#35;53;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;51;&&#35;59;", 0, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test635");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test636");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test637");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((-1), writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test638");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test639");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test640");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;" + "'", str4.equals("&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test641");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;", writer3);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test642");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test643");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi&#33;" + "'", str4.equals("hi&#33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test644");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", (int) (short) 100, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test645");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "hi&#33;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test646");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#51;&#52;", 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test647");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test648");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test649");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) '4');
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test650");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test651");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) '4');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#65;");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = numericEntityEscaper1.translate(0, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;65;" + "'", str3.equals("&#38;&#35;65;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test652");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;50;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;51;&&#35;56;&&#35;59;&&#35;35;&&#35;38;&&#35;35;&&#35;52;&&#35;57;&&#35;59;&&#35;38;&&#35;35;&&#35;52;&&#35;56;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;51;&&#35;59;&&#35;38;&&#35;35;&&#35;53;&&#35;57;&&#35;59;&&#35;33;", writer6);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test653");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str3.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test654");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 10);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) (short) 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test655");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 0, writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test656");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test657");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test658");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) '#');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#65;", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test659");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper3 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = numericEntityEscaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper1.with(charSequenceTranslatorArray4);
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
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test660");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(0);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#65;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#54;&#53;&#59;" + "'", str3.equals("&#38;&#35;&#54;&#53;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test661");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        boolean boolean7 = numericEntityEscaper2.translate((int) (short) -1, writer6);
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#54;&#53;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "&#38;&#35;&#54;&#53;&#59;" + "'", str9.equals("&#38;&#35;&#54;&#53;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test662");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test663");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) ' ', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi&#33;", (int) (short) -1, writer8);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test664");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) (byte) 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.io.Writer writer7 = null;
        int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#51;&#59;", 1, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test665");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(100, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test666");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test667");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (short) 0, writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test668");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate(charSequence3, 0, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test669");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test670");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "23", 10, writer6);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test671");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.io.Writer writer8 = null;
        boolean boolean9 = numericEntityEscaper2.translate((int) (byte) 0, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!" + "'", str4.equals("&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#51;&#59;" + "'", str6.equals("&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#51;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test672");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "A", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test673");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 10, writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test674");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test675");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test676");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) 'a');
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 0, writer4);
        java.lang.CharSequence charSequence6 = null;
        java.lang.String str7 = numericEntityEscaper2.translate(charSequence6);
        java.lang.Class<?> wildcardClass8 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test677");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", (int) '#', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test678");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test679");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test680");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test681");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        java.lang.Class<?> wildcardClass5 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;" + "'", str4.equals("&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test682");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test683");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test684");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) '4');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test685");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) '4');
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test686");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#54;&#53;&#59;", 1, writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test687");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!" + "'", str4.equals("&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#51;&#59;" + "'", str6.equals("&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#51;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test688");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test689");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (-1));
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test690");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', 1);
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper4 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = numericEntityEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = numericEntityEscaper2.with(charSequenceTranslatorArray5);
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
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test691");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#54;&#53;&#59;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test692");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, (-1));
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str8.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test693");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test694");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test695");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test696");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        java.lang.String str9 = numericEntityEscaper2.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str7.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "A" + "'", str9.equals("A"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test697");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (-1));
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.io.Writer writer7 = null;
        int int8 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;", (int) (byte) 100, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test698");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test699");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 0);
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
            System.out.format("%n%s%n", "NumericEntityEscaper1.test700");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(0, writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "64" + "'", str7.equals("64"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.test701");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#51;" + "'", str4.equals("&#50;&#51;"));
    }
}

