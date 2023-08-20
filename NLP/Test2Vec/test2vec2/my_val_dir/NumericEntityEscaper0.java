
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test01");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "", writer3);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test02");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test03");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer7 = null;
        boolean boolean8 = numericEntityEscaper1.translate((int) (short) 0, writer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#104;&#105;!" + "'", str3.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "&#104;&#105;!" + "'", str5.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test04");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test05");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) '#', writer3);
        java.lang.String str6 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.Class<?> wildcardClass7 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#104;&#105;!" + "'", str6.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test06");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(1, (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test07");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test08");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) (short) 10);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test09");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test10");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) (short) 10);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test11");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test12");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) ' ', (-1));
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test13");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) '#', writer3);
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = numericEntityEscaper1.translate((-1), writer6);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test14");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 0, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test15");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test16");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0" + "'", str1.equals("0"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test17");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF", (int) (byte) 100, writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#104;&#105;!" + "'", str3.equals("&#104;&#105;!"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test18");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test19");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test20");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test21");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, 0);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test22");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        java.io.Writer writer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int4 = numericEntityEscaper0.translate((java.lang.CharSequence) "0", (int) (short) 0, writer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test23");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((-1), (int) (short) 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test24");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "&#104;&#105;&#33;" + "'", str4.equals("&#104;&#105;&#33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test25");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test26");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(10);
        java.io.Writer writer3 = null;
        boolean boolean4 = numericEntityEscaper1.translate((int) '#', writer3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test27");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (byte) 0);
        java.lang.Class<?> wildcardClass2 = numericEntityEscaper1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test28");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf(0, 0);
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = numericEntityEscaper2.translate((java.lang.CharSequence) "FFFFFFFF", (int) '#', writer5);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test29");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!", writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The Writer must not be null");
        } catch (java.lang.IllegalArgumentException e) {
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test30");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 10);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test31");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test32");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) 'a');
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;&#33;", writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test33");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 1);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test34");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "1" + "'", str1.equals("1"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test35");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper0 = new org.apache.commons.lang3.text.translate.NumericEntityEscaper();
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.io.Writer writer4 = null;
        boolean boolean5 = numericEntityEscaper2.translate((int) '#', writer4);
        java.lang.String str7 = numericEntityEscaper2.translate((java.lang.CharSequence) "hi!");
        org.apache.commons.lang3.text.translate.CharSequenceTranslator[] charSequenceTranslatorArray8 = new org.apache.commons.lang3.text.translate.CharSequenceTranslator[] { numericEntityEscaper2 };
        org.apache.commons.lang3.text.translate.CharSequenceTranslator charSequenceTranslator9 = numericEntityEscaper0.with(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "&#104;&#105;!" + "'", str7.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslatorArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSequenceTranslator9);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test36");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below(100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test37");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test38");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) 10, (int) '4');
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test39");
        java.lang.String str1 = org.apache.commons.lang3.text.translate.CharSequenceTranslator.hex((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FFFFFFFF" + "'", str1.equals("FFFFFFFF"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test40");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (short) -1, 0);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test41");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) -1, (int) 'a');
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test42");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, 10);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test43");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) -1);
        java.io.Writer writer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = numericEntityEscaper1.translate((java.lang.CharSequence) "1", (int) ' ', writer4);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test44");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) '#');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "hi!");
        java.io.Writer writer8 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int9 = numericEntityEscaper1.translate((java.lang.CharSequence) "", (int) (byte) 1, writer8);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#104;&#105;!" + "'", str3.equals("&#104;&#105;!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "&#104;&#105;!" + "'", str5.equals("&#104;&#105;!"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test45");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.io.Writer writer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = numericEntityEscaper1.translate((int) '#', writer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test46");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.below((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test47");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 1);
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;!");
        java.lang.String str5 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;" + "'", str3.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#33;"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str5.equals("&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#50;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#56;&#59;&#38;&#35;&#51;&#53;&#59;&#38;&#35;&#52;&#57;&#59;&#38;&#35;&#52;&#56;&#59;&#38;&#35;&#53;&#51;&#59;&#38;&#35;&#53;&#57;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test48");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, (int) (byte) -1);
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test49");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
        java.lang.String str3 = numericEntityEscaper1.translate((java.lang.CharSequence) "FFFFFFFF");
        java.io.Writer writer6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = numericEntityEscaper1.translate((java.lang.CharSequence) "&#104;&#105;&#33;", (-1), writer6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test50");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) 'a');
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
            System.out.format("%n%s%n", "NumericEntityEscaper0.test51");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test52");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (short) 10, (int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test53");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper1 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.above((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper1);
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test54");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.outsideOf((int) (byte) -1, (int) (short) -1);
        java.lang.String str4 = numericEntityEscaper2.translate((java.lang.CharSequence) "");
        java.lang.String str6 = numericEntityEscaper2.translate((java.lang.CharSequence) "&#104;&#105;&#33;");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;" + "'", str6.equals("&#38;&#35;&#49;&#48;&#52;&#59;&#38;&#35;&#49;&#48;&#53;&#59;&#38;&#35;&#51;&#51;&#59;"));
    }

    @Test
    public void NumericEntityEscaper() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "NumericEntityEscaper0.test55");
        org.apache.commons.lang3.text.translate.NumericEntityEscaper numericEntityEscaper2 = org.apache.commons.lang3.text.translate.NumericEntityEscaper.between((int) (byte) 100, 1);
        java.lang.Class<?> wildcardClass3 = numericEntityEscaper2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(numericEntityEscaper2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }
}

