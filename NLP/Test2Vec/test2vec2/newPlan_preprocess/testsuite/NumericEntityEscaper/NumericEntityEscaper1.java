package NumericEntityEscaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NumericEntityEscaper1 {

    public static boolean debug = false;

    @Test
    public void NumericEntityEscaper501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper501");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper502");
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
    public void NumericEntityEscaper503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper503");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', 1);
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
    public void NumericEntityEscaper504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper504");
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
    public void NumericEntityEscaper505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper505");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper506");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper507");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper508");
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
    public void NumericEntityEscaper509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper509");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) '4');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper510");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (-1));
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
    public void NumericEntityEscaper511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper511");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper512");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper513");
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
    public void NumericEntityEscaper514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper514");
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
    public void NumericEntityEscaper515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper515");
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
    public void NumericEntityEscaper516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper516");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper517");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (short) 0);
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
    public void NumericEntityEscaper518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper518");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper519");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper520");
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
    public void NumericEntityEscaper521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper521");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper522");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper523");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, 1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;", 10, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper524");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) (short) 100, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper525");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper526");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 10);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper527");
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
    public void NumericEntityEscaper528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper528");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper529");
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
    public void NumericEntityEscaper530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper530");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (-1));
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper531");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;" + "'", str3.equals("&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;"));
    }

    @Test
    public void NumericEntityEscaper532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper532");
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
    public void NumericEntityEscaper533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper533");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) -1);
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
    public void NumericEntityEscaper534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper534");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (short) -1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "20", (int) (short) 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper535");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper536");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper537");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 1, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper538");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper539");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper540");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (short) 0);
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
    public void NumericEntityEscaper541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper541");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) (byte) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) 100, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper542");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, (-1));
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper543");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper544");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper545");
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
    public void NumericEntityEscaper546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper546");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper547");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper548");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper549");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper550");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper551");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 100);
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
    public void NumericEntityEscaper552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper552");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper553");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
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
    public void NumericEntityEscaper554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper554");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper555");
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
    public void NumericEntityEscaper556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper556");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 0);
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
    public void NumericEntityEscaper557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper557");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;&#38;&#35;7&#48;;", (int) (short) 100, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper558");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper559");
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
    public void NumericEntityEscaper560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper560");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper561");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
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
    public void NumericEntityEscaper562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper562");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper563");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper564");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) -1, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper565");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper566");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 0, (int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper567");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper568");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;&#38;&#35;&#55;&#48;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper569");
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
    public void NumericEntityEscaper570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper570");
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
    public void NumericEntityEscaper571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper571");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper572");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '4', 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper573");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper574");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper575");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper576");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void NumericEntityEscaper577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper577");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#50;&#48;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper578");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper579");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, (int) '4');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#70;&#70;&#70;&#70;&#70;&#70;&#70;&#70;");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper580");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper581");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper582");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper583");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper584");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (int) (byte) 1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;", 10, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper585");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (short) 100);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper586");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (-1));
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(100, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper587");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper588");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper589");
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
    public void NumericEntityEscaper590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper590");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper591");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper592");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '#', writer4);
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
    public void NumericEntityEscaper593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper593");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#54;&#49;" + "'", str4.equals("&#54;&#49;"));
    }

    @Test
    public void NumericEntityEscaper594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper594");
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
    public void NumericEntityEscaper595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper595");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper596");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper597");
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
    public void NumericEntityEscaper598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper598");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper599");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper600");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper601");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper602");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) 'a');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper603");
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
    public void NumericEntityEscaper604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper604");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        boolean boolean6 = numericEntityEscaper1.translate((int) (short) 100, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper605");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '4', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper606");
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
    public void NumericEntityEscaper607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper607");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper608");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((-1), (int) (byte) 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;&#33;" + "'", str4.equals("&#104;&#105;&#33;"));
    }

    @Test
    public void NumericEntityEscaper609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper609");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper610");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper611");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper612");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;65;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;65;" + "'", str4.equals("&#38;&#35;65;"));
    }

    @Test
    public void NumericEntityEscaper613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper613");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper614");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper615");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate(10, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper616");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper617");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void NumericEntityEscaper618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper618");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper619");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (short) 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#50;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper620");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '4', (int) (short) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper621");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), 100);
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

    @Test
    public void NumericEntityEscaper622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper622");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (byte) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper623");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper624");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper625");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper626");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", 0, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper627");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 0);
        java.io.Writer writer4 = null;
        int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!", (int) (byte) 0, writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper628");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) (byte) 1);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;", (int) ' ', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper629");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) 100);
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
    public void NumericEntityEscaper630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper630");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper631");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 100, (int) '4');
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (byte) 10, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper632");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 10, (int) (byte) 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#48;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#53;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#50;&#59;&#38;#&#53;&#54;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#49;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#56;&#59;&#38;#&#51;&#53;&#59;&#38;#&#53;&#51;&#59;&#38;#&#53;&#55;&#59;&#38;#&#53;&#57;&#59;&#38;#&#51;&#51;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper633");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 1, (int) (short) 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str4.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper634");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 0, (int) (short) -1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper635");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 10);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper636");
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
    public void NumericEntityEscaper637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper637");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper638");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper639");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper640");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 0, 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;" + "'", str4.equals("&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#52;&#56;&#59;"));
    }

    @Test
    public void NumericEntityEscaper641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper641");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 1);
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper642");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper643");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) '#');
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi&#33;" + "'", str4.equals("hi&#33;"));
    }

    @Test
    public void NumericEntityEscaper644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper644");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) 1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper645");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper646");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper647");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) 'a', (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper648");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, (int) (byte) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper649");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) '4');
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
    public void NumericEntityEscaper650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper650");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(100, 1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;!");
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
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;!" + "'", str4.equals("&#104;&#105;!"));
    }

    @Test
    public void NumericEntityEscaper651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper651");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) '4');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#65;");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper652");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 0);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper653");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(0);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;" + "'", str3.equals("&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#48;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#52;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#54;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#53;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#55;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#35;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#49;&#59;&#38;&#35;&#53;&#57;&#59;"));
    }

    @Test
    public void NumericEntityEscaper654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper654");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (byte) 10);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;#&#49;&#48;&#52;&#59;&#38;#&#49;&#48;&#53;&#59;!", (int) (short) 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper655");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper656");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper657");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper658");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) '#');
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper659");
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
    public void NumericEntityEscaper660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper660");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above(0);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#65;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#54;&#53;&#59;" + "'", str3.equals("&#38;&#35;&#54;&#53;&#59;"));
    }

    @Test
    public void NumericEntityEscaper661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper661");
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
    public void NumericEntityEscaper662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper662");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper663");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) -1, (int) (byte) -1);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) ' ', writer4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper664");
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
    public void NumericEntityEscaper665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper665");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (short) 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate(100, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper666");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper667");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(0, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper668");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, 0);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper669");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper670");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper671");
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
    public void NumericEntityEscaper672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper672");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 10, (int) (byte) 100);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper673");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 1, 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper674");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '4', (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper675");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) '#', 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper676");
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
    public void NumericEntityEscaper677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper677");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 1, (int) (short) 10);
        java.io.Writer writer5 = null;
        int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;", (int) '#', writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void NumericEntityEscaper678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper678");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) (short) -1, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void NumericEntityEscaper679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper679");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper680");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper681");
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
    public void NumericEntityEscaper682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper682");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper683");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '4', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper684");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) '4');
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper685");
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
    public void NumericEntityEscaper686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper686");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(10, (int) (short) 10);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper687");
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
    public void NumericEntityEscaper688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper688");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper689");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between(1, (-1));
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper690");
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
    public void NumericEntityEscaper691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper691");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in NumericEntityEscaper generation
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
    public void NumericEntityEscaper692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper692");
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
    public void NumericEntityEscaper693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper693");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) '#', (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper694");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper695");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) 100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper696");
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
    public void NumericEntityEscaper697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper697");
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
    public void NumericEntityEscaper698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper698");
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
    public void NumericEntityEscaper699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper699");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) ' ', (int) (byte) 0);
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
    public void NumericEntityEscaper700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper700");
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
    public void NumericEntityEscaper701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper1.NumericEntityEscaper701");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (byte) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#50;&#51;" + "'", str4.equals("&#50;&#51;"));
    }
}

