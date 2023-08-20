package OctalUnescaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OctalUnescaper0 {

    public static boolean debug = false;

    @Test
    public void OctalUnescaper001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper001");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void OctalUnescaper002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper002");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "23" + "'", str1.equals("23"));
    }

    @Test
    public void OctalUnescaper003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper003");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void OctalUnescaper004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper004");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "0", (int) '4', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper005");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) 'a', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper006");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void OctalUnescaper007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper007");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) 'a', writer7);
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
    public void OctalUnescaper008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper008");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void OctalUnescaper009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper009");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void OctalUnescaper010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper010");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper011");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 10, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void OctalUnescaper012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper012");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) 100, writer7);
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
    public void OctalUnescaper013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper013");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass3 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void OctalUnescaper014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper014");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate(charSequence5, (int) (short) 10, writer7);
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
    public void OctalUnescaper015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper015");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer6);
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
    public void OctalUnescaper016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper016");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate(charSequence7, writer8);
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
    public void OctalUnescaper017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper017");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate(charSequence3, (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper018");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass3 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void OctalUnescaper019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper019");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void OctalUnescaper020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper020");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper021");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
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
    public void OctalUnescaper022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper022");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper023");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void OctalUnescaper024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper024");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) '#', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void OctalUnescaper025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper025");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper026");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int4 = octalUnescaper0.translate((java.lang.CharSequence) "1", (int) (byte) -1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void OctalUnescaper027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper027");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void OctalUnescaper028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper028");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass8 = octalUnescaper0.getClass();
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
    public void OctalUnescaper029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper029");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void OctalUnescaper030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper030");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void OctalUnescaper031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper031");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper032");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper033");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper034");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper035");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void OctalUnescaper036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper036");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void OctalUnescaper037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper037");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) ' ', writer7);
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
    public void OctalUnescaper038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper038");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
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
    public void OctalUnescaper039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper039");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper040");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper041");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void OctalUnescaper042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper042");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper043");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "34" + "'", str1.equals("34"));
    }

    @Test
    public void OctalUnescaper044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper044");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.Class<?> wildcardClass1 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void OctalUnescaper045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper045");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void OctalUnescaper046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper046");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (byte) 100, writer7);
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
    public void OctalUnescaper047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper047");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper048");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper049");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper050");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "A", (int) '4', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper051");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper052");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "", (int) (short) 1, writer7);
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
    public void OctalUnescaper053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper053");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer6);
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
    public void OctalUnescaper054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper054");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
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
    public void OctalUnescaper055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper055");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper056");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "61" + "'", str1.equals("61"));
    }

    @Test
    public void OctalUnescaper057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper057");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer8);
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
    public void OctalUnescaper058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper058");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer6);
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
    public void OctalUnescaper059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper059");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer8);
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
    public void OctalUnescaper060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper060");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = octalUnescaper0.translate((java.lang.CharSequence) "23");
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
    public void OctalUnescaper061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper061");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) 10, writer7);
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
    public void OctalUnescaper062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper062");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "34", (int) (byte) 10, writer7);
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
    public void OctalUnescaper063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper063");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer8);
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
    public void OctalUnescaper064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper064");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void OctalUnescaper065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper065");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper066");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper067");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void OctalUnescaper068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper068");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 100, writer7);
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
    public void OctalUnescaper069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper069");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void OctalUnescaper070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper070");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void OctalUnescaper071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper071");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
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
    public void OctalUnescaper072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper072");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer8);
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
    public void OctalUnescaper073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper073");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.Class<?> wildcardClass3 = charSequenceTranslator2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void OctalUnescaper074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper074");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper075");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void OctalUnescaper076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper076");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void OctalUnescaper077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper077");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper078");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
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
    public void OctalUnescaper079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper079");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer6);
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
    public void OctalUnescaper080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper080");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper081");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper082");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void OctalUnescaper083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper083");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper084");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer7);
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
    public void OctalUnescaper085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper085");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate(charSequence3, (int) (short) -1, writer5);
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
    public void OctalUnescaper086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper086");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper087");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void OctalUnescaper088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper088");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper089");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper090");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.Class<?> wildcardClass3 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void OctalUnescaper091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper091");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void OctalUnescaper092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper092");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper093");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper094");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.Class<?> wildcardClass3 = charSequenceTranslatorArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void OctalUnescaper095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper095");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) '#', writer7);
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
    public void OctalUnescaper096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper096");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void OctalUnescaper097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper097");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer6);
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
    public void OctalUnescaper098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper098");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "34", 10, writer7);
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
    public void OctalUnescaper099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper099");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void OctalUnescaper100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper100");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer6);
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
    public void OctalUnescaper101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper101");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper102");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "20" + "'", str1.equals("20"));
    }

    @Test
    public void OctalUnescaper103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper103");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void OctalUnescaper104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper104");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper105");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper106");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper107");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) 1, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper108");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper109");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper110");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 100, writer7);
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
    public void OctalUnescaper111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper111");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper112");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer6);
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
    public void OctalUnescaper113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper113");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64" + "'", str1.equals("64"));
    }

    @Test
    public void OctalUnescaper114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper114");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = octalUnescaper0.translate((java.lang.CharSequence) "61");
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
    public void OctalUnescaper115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper115");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper116");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int4 = octalUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 1, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void OctalUnescaper117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper117");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper118");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper119");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "", 10, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper120");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void OctalUnescaper121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper121");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) '4', writer5);
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
    public void OctalUnescaper122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper122");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper123");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void OctalUnescaper124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper124");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (-1), writer5);
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
    public void OctalUnescaper125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper125");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper126");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray5);
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
    public void OctalUnescaper127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper127");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper128");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
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
    public void OctalUnescaper129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper129");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper130");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper131");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper132");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer6);
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
    public void OctalUnescaper133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper133");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer4);
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
    public void OctalUnescaper134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper134");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer6);
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
    public void OctalUnescaper135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper135");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper136");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "34", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void OctalUnescaper137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper137");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = octalUnescaper0.translate((java.lang.CharSequence) "0");
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
    public void OctalUnescaper138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper138");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = charSequenceTranslator4.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void OctalUnescaper139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper139");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
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
    public void OctalUnescaper140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper140");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper141");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer7);
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
    public void OctalUnescaper142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper142");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper143");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper144");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper145");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer6);
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
    public void OctalUnescaper146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper146");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate(charSequence3, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper147");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper148");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void OctalUnescaper149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper149");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper150");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper151");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper152");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper153");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
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
    public void OctalUnescaper154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper154");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer6);
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
    public void OctalUnescaper155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper155");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "20", 0, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper156");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1" + "'", str6.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void OctalUnescaper157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper157");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void OctalUnescaper158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper158");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
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
    public void OctalUnescaper159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper159");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper160");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void OctalUnescaper161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper161");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void OctalUnescaper162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper162");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) 0, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void OctalUnescaper163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper163");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper164");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper165");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer6);
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
    public void OctalUnescaper166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper166");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper167");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", 1, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper168");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper169");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper170");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "", (int) (byte) 1, writer7);
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
    public void OctalUnescaper171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper171");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer6);
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
    public void OctalUnescaper172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper172");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper173");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper174");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void OctalUnescaper175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper175");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper176");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer6);
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
    public void OctalUnescaper177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper177");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper178");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "0", (int) ' ', writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper179");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void OctalUnescaper180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper180");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) ' ', writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void OctalUnescaper181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper181");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer6);
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
    public void OctalUnescaper182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper182");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer6);
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
    public void OctalUnescaper183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper183");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer6);
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
    public void OctalUnescaper184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper184");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper185");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper186");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate(charSequence5, writer6);
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
    public void OctalUnescaper187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper187");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper188");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper189");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper190");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper191");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = octalUnescaper0.translate((java.lang.CharSequence) "A");
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
    public void OctalUnescaper192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper192");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer4);
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
    public void OctalUnescaper193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper193");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper194");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "0", (int) (byte) -1, writer7);
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
    public void OctalUnescaper195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper195");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper5 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper196");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper5 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper197");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper198");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper199");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
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
    public void OctalUnescaper200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper200");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "1", (int) ' ', writer7);
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
    public void OctalUnescaper201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper201");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper202");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "", 100, writer7);
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
    public void OctalUnescaper203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper203");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "20", (int) (short) 100, writer7);
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
    public void OctalUnescaper204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper204");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper205");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) 'a', writer7);
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
    public void OctalUnescaper206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper206");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper207");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper208");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper209");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
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
    public void OctalUnescaper210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper210");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void OctalUnescaper211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper211");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper212");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper213");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper5 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper214");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void OctalUnescaper215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper215");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper216");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper217");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer6);
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
    public void OctalUnescaper218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper218");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
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
    public void OctalUnescaper219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper219");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper220");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (byte) 100, writer7);
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
    public void OctalUnescaper221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper221");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer8);
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
    public void OctalUnescaper222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper222");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "20" + "'", str4.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper223");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void OctalUnescaper224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper224");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer6);
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
    public void OctalUnescaper225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper225");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper226");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void OctalUnescaper227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper227");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 10, writer7);
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
    public void OctalUnescaper228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper228");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer8);
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
    public void OctalUnescaper229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper229");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
        java.lang.String str9 = octalUnescaper0.translate((java.lang.CharSequence) "");
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
    public void OctalUnescaper230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper230");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray5);
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
    public void OctalUnescaper231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper231");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper232");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
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
    public void OctalUnescaper233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper233");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
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
    public void OctalUnescaper234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper234");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper235");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void OctalUnescaper236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper236");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer6);
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
    public void OctalUnescaper237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper237");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void OctalUnescaper238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper238");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
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
    public void OctalUnescaper239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper239");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper5 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper240");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper241");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "23" + "'", str6.equals("23"));
    }

    @Test
    public void OctalUnescaper242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper242");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer6);
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
    public void OctalUnescaper243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper243");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "", (int) '#', writer7);
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
    public void OctalUnescaper244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper244");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "1", 0, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper245");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "61" + "'", str6.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void OctalUnescaper246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper246");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
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
    public void OctalUnescaper247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper247");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence5 = null;
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate(charSequence5, writer6);
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
    public void OctalUnescaper248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper248");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate(charSequence7, writer8);
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
    public void OctalUnescaper249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper249");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void OctalUnescaper250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper250");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper251");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
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
    public void OctalUnescaper252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper252");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
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
    public void OctalUnescaper253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper253");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void OctalUnescaper254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper254");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void OctalUnescaper255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper255");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer6);
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
    public void OctalUnescaper256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper256");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void OctalUnescaper257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper257");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper258");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper259");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "61", (int) 'a', writer7);
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
    public void OctalUnescaper260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper260");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper261");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "0", (int) (short) 100, writer7);
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
    public void OctalUnescaper262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper262");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "64", (int) '#', writer5);
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
    public void OctalUnescaper263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper263");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper264");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = octalUnescaper0.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper265");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper266");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper267");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper268");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void OctalUnescaper269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper269");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer6);
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
    public void OctalUnescaper270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper270");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = octalUnescaper0.translate(charSequence7);
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
    public void OctalUnescaper271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper271");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper272");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper5 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper5.with(charSequenceTranslatorArray6);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper273");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void OctalUnescaper274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper274");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper275");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer6);
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
    public void OctalUnescaper276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper276");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
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
    public void OctalUnescaper277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper277");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper278");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
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
    public void OctalUnescaper279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper279");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "20", (int) (byte) 1, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper280");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper281");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper282");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
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
    public void OctalUnescaper283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper283");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper284");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper285");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void OctalUnescaper286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper286");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper287");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void OctalUnescaper288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper288");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper289");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void OctalUnescaper290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper290");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper291");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "A", (int) (byte) -1, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void OctalUnescaper292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper292");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper293");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "", (int) (short) -1, writer7);
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
    public void OctalUnescaper294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper294");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper295");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper296");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer8);
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
    public void OctalUnescaper297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper297");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper298");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper299");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "61", (int) (byte) 100, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper300");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper301");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray5);
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
    public void OctalUnescaper302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper302");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void OctalUnescaper303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper303");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper304");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer6);
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
    public void OctalUnescaper305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper305");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void OctalUnescaper306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper306");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer6);
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
    public void OctalUnescaper307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper307");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
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
    public void OctalUnescaper308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper308");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper309");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
    }

    @Test
    public void OctalUnescaper310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper310");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void OctalUnescaper311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper311");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper312");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "61", (int) (short) -1, writer5);
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
    public void OctalUnescaper313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper313");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper314");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "23" + "'", str8.equals("23"));
    }

    @Test
    public void OctalUnescaper315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper315");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer8);
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
    public void OctalUnescaper316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper316");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper317");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper318");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper319");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper320");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void OctalUnescaper321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper321");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper322");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper323");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper324");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
    }

    @Test
    public void OctalUnescaper325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper325");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 10, writer7);
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
    public void OctalUnescaper326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper326");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (short) -1, writer7);
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
    public void OctalUnescaper327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper327");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
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
    public void OctalUnescaper328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper328");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper329");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper330");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void OctalUnescaper331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper331");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper332");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void OctalUnescaper333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper333");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void OctalUnescaper334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper334");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
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
    public void OctalUnescaper335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper335");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper336");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper337");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper338");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer8);
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
    public void OctalUnescaper339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper339");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper340");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper341");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
    }

    @Test
    public void OctalUnescaper342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper342");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (byte) -1, writer7);
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
    public void OctalUnescaper343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper343");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.CharSequence charSequence3 = null;
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate(charSequence3, writer4);
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
    public void OctalUnescaper344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper344");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper345");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void OctalUnescaper346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper346");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void OctalUnescaper347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper347");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "20", 10, writer7);
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
    public void OctalUnescaper348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper348");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void OctalUnescaper349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper349");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper350");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper351");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void OctalUnescaper352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper352");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "20", 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void OctalUnescaper353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper353");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper354");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 100, writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper355");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = octalUnescaper0.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper356");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void OctalUnescaper357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper357");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper358");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper359");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray7);
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
    public void OctalUnescaper360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper360");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
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
    public void OctalUnescaper361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper361");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "A" + "'", str6.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void OctalUnescaper362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper362");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate(charSequence7, writer8);
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
    public void OctalUnescaper363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper363");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 0, writer7);
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
    public void OctalUnescaper364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper364");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer4);
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
    public void OctalUnescaper365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper365");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str5 = octalUnescaper3.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray6 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { octalUnescaper3 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper0.with(charSequenceTranslatorArray6);
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
    public void OctalUnescaper366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper366");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) 'a', writer7);
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
    public void OctalUnescaper367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper367");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "1");
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
    public void OctalUnescaper368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper368");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper369");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer6);
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
    public void OctalUnescaper370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper370");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper371");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper372");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "A" + "'", str8.equals("A"));
    }

    @Test
    public void OctalUnescaper373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper373");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void OctalUnescaper374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper374");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper375");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper376");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "64", (int) (byte) 100, writer7);
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
    public void OctalUnescaper377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper377");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper378");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = octalUnescaper0.translate(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void OctalUnescaper379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper379");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer6);
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
    public void OctalUnescaper380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper380");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void OctalUnescaper381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper381");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper382");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "34" + "'", str8.equals("34"));
    }

    @Test
    public void OctalUnescaper383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper383");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "34", writer8);
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
    public void OctalUnescaper384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper384");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray5);
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
    public void OctalUnescaper385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper385");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }

    @Test
    public void OctalUnescaper386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper386");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper387");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = charSequenceTranslator4.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0" + "'", str6.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void OctalUnescaper388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper388");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper389");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper390");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper391");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper392");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper393");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper394");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "61", (int) (byte) 10, writer7);
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
    public void OctalUnescaper395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper395");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void OctalUnescaper396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper396");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper397");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer8);
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
    public void OctalUnescaper398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper398");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.CharSequence charSequence7 = null;
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate(charSequence7, writer8);
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
    public void OctalUnescaper399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper399");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper400");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "A" + "'", str4.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "FFFFFFFF" + "'", str6.equals("FFFFFFFF"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0" + "'", str8.equals("0"));
    }

    @Test
    public void OctalUnescaper401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper401");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper402");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper403");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 100, writer7);
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
    public void OctalUnescaper404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper404");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper405");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 0, writer5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper406");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
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
    }

    @Test
    public void OctalUnescaper407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper407");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = octalUnescaper0.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper408");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void OctalUnescaper409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper409");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer6);
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
    public void OctalUnescaper410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper410");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper411");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper412");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void OctalUnescaper413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper413");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper414");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void OctalUnescaper415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper415");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper1.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray5);
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
    }

    @Test
    public void OctalUnescaper416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper416");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
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
    public void OctalUnescaper417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper417");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper418");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper419");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0" + "'", str4.equals("0"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "64" + "'", str8.equals("64"));
    }

    @Test
    public void OctalUnescaper420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper420");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper421");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper422");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!", (int) (short) 1, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper423");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper424");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer4);
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
    public void OctalUnescaper425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper425");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void OctalUnescaper426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper426");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper427");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "20" + "'", str6.equals("20"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void OctalUnescaper428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper428");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void OctalUnescaper429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper429");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
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
    public void OctalUnescaper430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper430");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper431");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "A", (int) 'a', writer7);
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
    public void OctalUnescaper432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper432");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void OctalUnescaper433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper433");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "23", writer8);
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
    public void OctalUnescaper434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper434");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void OctalUnescaper435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper435");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void OctalUnescaper436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper436");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "20", writer8);
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
    public void OctalUnescaper437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper437");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "61", writer8);
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
    public void OctalUnescaper438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper438");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "64" + "'", str4.equals("64"));
    }

    @Test
    public void OctalUnescaper439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper439");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper440");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "64", (int) 'a', writer7);
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
    public void OctalUnescaper441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper441");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper442");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void OctalUnescaper443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper443");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper444");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "1", 1, writer7);
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
    public void OctalUnescaper445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper445");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer8);
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
    public void OctalUnescaper446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper446");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "64");
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
    public void OctalUnescaper447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper447");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64" + "'", str6.equals("64"));
    }

    @Test
    public void OctalUnescaper448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper448");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper449");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence3 = null;
        java.lang.String str4 = octalUnescaper0.translate(charSequence3);
        java.lang.Class<?> wildcardClass5 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void OctalUnescaper450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper450");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = octalUnescaper0.translate(charSequence7);
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
    public void OctalUnescaper451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper451");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray5);
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
    public void OctalUnescaper452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper452");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "1", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper453");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.Class<?> wildcardClass3 = octalUnescaper0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void OctalUnescaper454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper454");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray4 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper3.with(charSequenceTranslatorArray4);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray4);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "64");
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
    public void OctalUnescaper455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper455");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper456");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer6);
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
    public void OctalUnescaper457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper457");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "20", (int) (short) -1, writer7);
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
    public void OctalUnescaper458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper458");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
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
    public void OctalUnescaper459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper459");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper460");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "64", writer8);
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
    public void OctalUnescaper461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper461");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
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
    public void OctalUnescaper462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper462");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = charSequenceTranslator2.translate((java.lang.CharSequence) "");
        java.lang.String str8 = charSequenceTranslator2.translate((java.lang.CharSequence) "20");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "20" + "'", str8.equals("20"));
    }

    @Test
    public void OctalUnescaper463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper463");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper2 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray3 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper2.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator5 = octalUnescaper1.with(charSequenceTranslatorArray3);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray3);
        java.lang.String str8 = charSequenceTranslator6.translate((java.lang.CharSequence) "A");
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
    }

    @Test
    public void OctalUnescaper464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper464");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void OctalUnescaper465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper465");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
    }

    @Test
    public void OctalUnescaper466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper466");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF", writer8);
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
    public void OctalUnescaper467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper467");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FFFFFFFF" + "'", str8.equals("FFFFFFFF"));
    }

    @Test
    public void OctalUnescaper468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper468");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer6);
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
    public void OctalUnescaper469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper469");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer6);
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
    public void OctalUnescaper470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper470");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "20", 1, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "A" + "'", str2.equals("A"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void OctalUnescaper471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper471");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "A", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper472");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (short) 1, writer5);
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper473");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper474");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "0", writer8);
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
    public void OctalUnescaper475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper475");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper476");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray1 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator2 = octalUnescaper0.with(charSequenceTranslatorArray1);
        java.lang.String str4 = charSequenceTranslator2.translate((java.lang.CharSequence) "A");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper477");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "61");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "hi!" + "'", str2.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "61" + "'", str4.equals("61"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "34" + "'", str6.equals("34"));
    }

    @Test
    public void OctalUnescaper478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper478");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper479");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper480");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        int int8 = octalUnescaper0.translate((java.lang.CharSequence) "0", (int) (short) 0, writer7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper481");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "23" + "'", str2.equals("23"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1" + "'", str4.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void OctalUnescaper482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper482");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer6);
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
    public void OctalUnescaper483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper483");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) 'a', writer7);
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
    public void OctalUnescaper484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper484");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int8 = octalUnescaper0.translate((java.lang.CharSequence) "23", (int) (byte) -1, writer7);
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
    public void OctalUnescaper485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper485");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "61");
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
    public void OctalUnescaper486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper486");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer8);
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
    public void OctalUnescaper487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper487");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper3 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper4 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper4.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator7 = octalUnescaper3.with(charSequenceTranslatorArray5);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator8 = octalUnescaper0.with(charSequenceTranslatorArray5);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper488");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.lang.Class<?> wildcardClass7 = octalUnescaper0.getClass();
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
    public void OctalUnescaper489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper489");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "23");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "0");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "64");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "A", writer8);
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
    public void OctalUnescaper490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper490");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "", writer6);
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
    public void OctalUnescaper491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper491");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "34");
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
    public void OctalUnescaper492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper492");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        int int6 = octalUnescaper0.translate((java.lang.CharSequence) "1", 0, writer5);
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "hi!", writer8);
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
    public void OctalUnescaper493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper493");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "34");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray5 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator6 = octalUnescaper0.with(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "34" + "'", str4.equals("34"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator6);
    }

    @Test
    public void OctalUnescaper494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper494");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
        java.lang.String str6 = charSequenceTranslator4.translate((java.lang.CharSequence) "");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
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
    public void OctalUnescaper495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper495");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper1 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray2 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] {};
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator3 = octalUnescaper1.with(charSequenceTranslatorArray2);
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator4 = octalUnescaper0.with(charSequenceTranslatorArray2);
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
    public void OctalUnescaper496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper496");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            octalUnescaper0.translate((java.lang.CharSequence) "1", writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void OctalUnescaper497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper497");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "A");
        java.lang.CharSequence charSequence7 = null;
        java.lang.String str8 = octalUnescaper0.translate(charSequence7);
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper498");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "");
        java.lang.String str4 = octalUnescaper0.translate((java.lang.CharSequence) "hi!");
        java.lang.CharSequence charSequence5 = null;
        java.lang.String str6 = octalUnescaper0.translate(charSequence5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void OctalUnescaper499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper499");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.io.Writer writer3 = null;
        int int4 = octalUnescaper0.translate((java.lang.CharSequence) "23", 1, writer3);
        java.lang.String str6 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.String str8 = octalUnescaper0.translate((java.lang.CharSequence) "20");
        java.lang.Class<?> wildcardClass9 = octalUnescaper0.getClass();
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
    public void OctalUnescaper500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "OctalUnescaper0.OctalUnescaper500");
        org.apache.commons.lang3.text.translate.OctalUnescaper octalUnescaper0 = new org.apache.commons.lang3.text.translate.OctalUnescaper();
        java.lang.String str2 = octalUnescaper0.translate((java.lang.CharSequence) "1");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in OctalUnescaper generation
        try {
            int int6 = octalUnescaper0.translate((java.lang.CharSequence) "61", 10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1" + "'", str2.equals("1"));
    }
}

