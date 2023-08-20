
package UnicodeEscaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnicodeEscaper1 {

    public static boolean debug = false;

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test501");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) '4');
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test502");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 1);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test503");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) -1, (int) (byte) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750034\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750034\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031", (int) (short) 1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u005Cu\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test504");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0036\\u0031" + "'", str4.equals("\\u0036\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test505");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u0021", 100, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test506");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (-1));
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test507");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) '#');
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test508");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) -1);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer8 = null;
        boolean boolean9 = unicodeEscaper1.translate((int) (short) 1, writer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str6.equals("\\u0068\\u0069\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test509");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) '#');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0032\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test510");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test511");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (short) 10);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate(charSequence3, (int) (byte) 0, writer5);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test512");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) (byte) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u0021");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = unicodeEscaper2.translate((int) (short) 0, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4.equals("\\u0068\\u0069\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test513");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test514");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test515");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\\\u00750068\\\\u00750069!" + "'", str4.equals("\\\\u00750068\\\\u00750069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test516");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031" + "'", str4.equals("\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test517");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) '4');
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test518");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test519");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 0, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0036\\u0031" + "'", str4.equals("\\u0036\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039!"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test520");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test521");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, (int) (byte) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0031", writer4);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test522");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 0);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test523");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test524");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 100);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0034\\u0033\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0037\\u005C\\u0075\\u0030\\u0030\\u0033\\u0035\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u0075\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0033\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031");
        java.io.Writer writer7 = null;
        int int8 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750032\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031", 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750034\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750034\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031" + "'", str4.equals("\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750034\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750034\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u00750075\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test525");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(10, (int) (short) 100);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750038\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750039\\\\u0075005C\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u00750030\\\\u00750030\\\\u00750032\\\\u00750031", writer4);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test526");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test527");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test528");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 1, (int) (short) 100);
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750036\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750035\\\\u00750043\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750037\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750037\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750035\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750030\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750033\\\\u0075005C\\\\u00750075\\\\u00750030\\\\u00750030\\\\u00750033\\\\u00750031", (int) (short) 10, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test529");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 100, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test530");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) 'a', 0);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test531");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(0, (int) (byte) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750068\\\\u00750069!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\\\u00750068\\\\u00750069!" + "'", str4.equals("\\\\u00750068\\\\u00750069!"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test532");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) '4');
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0034\\u0033\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0038\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0034\\u0033\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0036\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0033\\u005Cu\\u0030\\u0030\\u0033\\u0039\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0035\\u0043\\u005Cu\\u0030\\u0030\\u0037\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0037\\u005Cu\\u0030\\u0030\\u0033\\u0035\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0030\\u005Cu\\u0030\\u0030\\u0033\\u0032\\u005Cu\\u0030\\u0030\\u0033\\u0031", (int) 'a', writer5);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test533");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0036\\u0031");
        java.lang.Class<?> wildcardClass7 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069!" + "'", str4.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\\\u00750036\\\\u00750031" + "'", str6.equals("\\\\u00750036\\\\u00750031"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test534");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(100, (int) (short) 0);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((-1), writer4);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test535");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test536");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) ' ');
        java.io.Writer writer4 = null;
        int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0036\\u005C\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u0030\\u0030\\u0033\\u0031", (int) (byte) 0, writer4);
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper1.translate((int) (byte) 100, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test537");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 1, 1);
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper4 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = unicodeEscaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = unicodeEscaper2.with(charSequenceTranslatorArray5);
        java.lang.String str9 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
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
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\\u0041" + "'", str9.equals("\\u0041"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test538");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test539");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) (byte) 0);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test540");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 100, (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test541");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above(100);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005Cu\\u0030\\u0030\\u0036\\u0038\\u005Cu\\u0030\\u0030\\u0036\\u0039\\u0021");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "", (int) (short) 1, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test542");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) '#');
        java.io.Writer writer5 = null;
        int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\\\u00750036\\\\u00750031", (int) (byte) 1, writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test543");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) '#', (int) 'a');
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test544");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 10, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test545");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test546");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test547");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test548");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) ' ');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0041");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031" + "'", str4.equals("\\u005C\\u0075\\u0030\\u0030\\u0034\\u0031"));
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test549");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 0, (int) (short) 0);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (short) 0, writer4);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test550");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(100, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test551");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) 'a');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "61", writer3);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test552");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between(1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test553");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((-1), (int) 'a');
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate(1, writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "FFFFFFFF" + "'", str4.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void UnicodeEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper1.test554");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, (int) (short) 1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 10, writer4);
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
            System.out.format("%n%s%n", "UnicodeEscaper1.test555");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }
}

