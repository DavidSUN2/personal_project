package UnicodeEscaper;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UnicodeEscaper0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test01");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
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
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test02");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test03");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        boolean boolean8 = unicodeEscaper1.translate((int) (short) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u0068\\u0069!" + "'", str3.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\u0068\\u0069!" + "'", str5.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test04");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
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
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test05");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '#', writer3);
        java.lang.String str6 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u0068\\u0069!" + "'", str6.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test06");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test07");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test08");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 10);
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
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test09");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test10");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test11");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) ' ', (-1));
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test12");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '#', writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = unicodeEscaper1.translate((-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test13");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test14");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test15");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test16");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 100, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u0068\\u0069!" + "'", str3.equals("\\u0068\\u0069!"));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test17");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test18");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test19");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test20");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
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
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test21");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = unicodeEscaper0.translate((java.lang.CharSequence) "0", (int) (short) 0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test22");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test23");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(10);
        java.io.Writer writer3 = null;
        boolean boolean4 = unicodeEscaper1.translate((int) '#', writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test24");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test25");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf(0, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = unicodeEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test26");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069!", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test27");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test28");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test29");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) 'a');
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test30");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "");
        java.lang.Class<?> wildcardClass4 = unicodeEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test31");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test32");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper0 = new org.apache.commons.lang3.text.translate.UnicodeEscaper();
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) '#', writer4);
        java.lang.String str7 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { unicodeEscaper2 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = unicodeEscaper0.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\\u0068\\u0069!" + "'", str7.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test33");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test34");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test35");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) 10, (int) '4');
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test36");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test37");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test38");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) -1, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = unicodeEscaper2.translate((int) (byte) 0, writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test39");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, 10);
        java.io.Writer writer4 = null;
        boolean boolean5 = unicodeEscaper2.translate((int) (byte) 0, writer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test40");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = unicodeEscaper1.translate((java.lang.CharSequence) "1", (int) ' ', writer4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test41");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = unicodeEscaper1.translate((java.lang.CharSequence) "", (int) (byte) 1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u0068\\u0069!" + "'", str3.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\u0068\\u0069!" + "'", str5.equals("\\u0068\\u0069!"));
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test42");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate((int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u0021" + "'", str3.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u0021"));
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test43");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test44");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069!");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u0021");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u0021" + "'", str3.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str5.equals("\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0038\\u005C\\u0075\\u0030\\u0030\\u0035\\u0043\\u005C\\u0075\\u0030\\u0030\\u0037\\u0035\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0030\\u005C\\u0075\\u0030\\u0030\\u0033\\u0036\\u005C\\u0075\\u0030\\u0030\\u0033\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test45");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, (int) (byte) -1);
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test46");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = unicodeEscaper1.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021", (-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "FFFFFFFF" + "'", str3.equals("FFFFFFFF"));
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test47");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) 'a');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = unicodeEscaper1.translate((-1), writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test48");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test49");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (short) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test50");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test51");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass3 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test52");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test53");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 10);
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test54");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) ' ', (int) '4');
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
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test55");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 10);
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test56");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 10);
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test57");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069\\u0021");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper2.translate((java.lang.CharSequence) "\\u0068\\u0069!", writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031" + "'", str6.equals("\\u005C\\u0075\\u0030\\u0030\\u0036\\u0038\\u005C\\u0075\\u0030\\u0030\\u0036\\u0039\\u005C\\u0075\\u0030\\u0030\\u0032\\u0031"));
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test58");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.between((-1), (int) (short) 10);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        boolean boolean7 = unicodeEscaper2.translate((int) ' ', writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test59");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) (short) 1);
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = unicodeEscaper1.translate(10, writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test60");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.below((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test61");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "A" + "'", str1.equals("A"));
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test62");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
        java.lang.String str4 = unicodeEscaper2.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass5 = unicodeEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\\u0068\\u0069\\u0021" + "'", str4.equals("\\u0068\\u0069\\u0021"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test63");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper2 = org.apache.commons.lang3.text.translate.UnicodeEscaper.outsideOf((int) (short) 0, (int) 'a');
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
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test64");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UnicodeEscaper0.test65");
        org.apache.commons.lang3.text.translate.UnicodeEscaper unicodeEscaper1 = org.apache.commons.lang3.text.translate.UnicodeEscaper.above((int) '#');
        java.lang.String str3 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = unicodeEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            unicodeEscaper1.translate((java.lang.CharSequence) "", writer7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(unicodeEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\\u0068\\u0069!" + "'", str3.equals("\\u0068\\u0069!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\\u0068\\u0069!" + "'", str5.equals("\\u0068\\u0069!"));
    }
}

