
package EntityArrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EntityArrays0 {

    public static boolean debug = false;

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test001");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test002");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray1, strArray3 };
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test003");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test004");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test005");
        org.apache.commons.lang3.text.translate.EntityArrays entityArrays0 = new org.apache.commons.lang3.text.translate.EntityArrays();
        java.lang.Class<?> wildcardClass1 = entityArrays0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test006");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test007");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test008");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test009");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test010");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test011");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test012");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test013");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test014");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test015");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test016");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test017");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test018");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test019");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test020");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test021");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test022");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test023");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test024");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test025");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test026");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test027");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test028");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass4 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test029");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test030");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test031");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test032");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test033");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test034");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test035");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test036");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test037");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test038");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test039");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test040");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test041");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test042");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test043");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test044");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test045");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test046");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test047");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test048");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test049");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test050");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test051");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test052");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test053");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test054");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test055");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test056");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test057");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test058");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test059");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test060");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test061");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test062");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test063");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test064");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test065");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test066");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test067");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test068");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test069");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test070");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test071");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test072");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test073");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test074");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test075");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test076");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test077");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test078");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test079");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test080");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test081");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test082");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test083");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test084");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test085");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test086");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test087");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test088");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test089");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test090");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test091");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test092");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test093");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test094");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test095");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test096");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test097");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test098");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test099");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test100");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test101");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test102");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test103");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test104");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test105");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test106");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test107");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test108");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test109");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test110");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test111");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test112");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test113");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test114");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test115");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test116");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test117");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test118");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test119");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test120");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test121");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test122");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test123");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test124");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test125");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test126");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test127");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test128");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test129");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test130");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test131");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test132");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test133");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test134");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test135");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test136");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test137");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test138");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test139");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test140");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test141");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test142");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass4 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test143");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test144");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test145");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test146");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test147");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test148");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test149");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test150");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test151");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test152");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test153");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test154");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test155");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test156");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test157");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test158");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test159");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test160");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test161");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass4 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test162");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test163");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test164");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test165");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test166");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test167");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test168");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test169");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test170");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test171");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test172");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test173");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test174");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test175");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test176");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test177");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test178");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test179");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test180");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test181");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test182");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test183");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test184");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test185");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test186");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test187");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test188");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test189");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test190");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test191");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test192");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test193");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test194");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test195");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test196");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test197");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test198");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test199");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test200");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test201");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test202");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test203");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test204");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test205");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test206");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test207");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test208");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test209");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test210");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test211");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test212");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test213");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test214");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test215");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test216");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test217");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test218");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test219");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test220");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test221");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test222");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test223");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test224");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test225");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test226");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test227");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test228");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test229");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test230");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test231");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test232");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test233");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test234");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test235");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test236");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test237");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test238");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test239");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test240");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test241");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test242");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test243");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test244");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test245");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test246");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass6 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test247");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass2 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test248");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test249");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test250");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test251");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test252");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test253");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test254");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test255");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test256");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test257");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test258");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test259");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test260");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test261");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test262");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test263");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test264");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test265");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test266");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test267");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test268");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test269");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test270");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test271");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test272");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test273");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test274");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test275");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test276");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test277");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test278");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test279");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test280");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test281");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test282");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test283");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test284");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test285");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test286");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test287");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test288");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test289");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test290");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test291");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test292");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test293");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test294");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test295");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test296");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test297");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test298");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test299");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test300");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test301");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test302");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test303");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test304");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test305");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test306");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test307");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test308");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test309");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test310");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test311");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test312");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test313");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test314");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test315");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test316");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test317");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test318");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test319");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test320");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test321");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test322");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test323");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test324");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test325");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test326");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test327");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test328");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test329");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test330");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test331");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test332");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test333");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test334");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test335");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test336");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test337");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test338");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test339");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test340");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test341");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test342");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test343");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test344");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass7 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test345");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test346");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test347");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test348");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test349");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test350");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test351");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test352");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test353");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test354");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test355");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test356");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test357");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test358");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test359");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass5 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test360");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test361");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test362");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test363");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test364");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test365");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test366");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test367");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test368");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test369");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test370");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test371");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test372");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test373");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test374");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test375");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test376");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test377");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test378");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test379");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test380");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.Class<?> wildcardClass9 = strArray3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test381");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test382");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test383");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test384");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test385");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test386");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test387");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test388");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test389");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test390");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test391");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test392");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test393");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test394");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test395");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test396");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test397");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test398");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test399");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test400");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test401");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test402");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test403");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test404");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test405");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test406");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.Class<?> wildcardClass5 = strArray1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test407");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test408");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test409");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test410");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test411");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test412");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test413");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test414");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test415");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test416");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test417");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test418");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test419");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test420");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass7 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test421");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test422");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test423");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test424");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test425");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test426");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass9 = strArray8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test427");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "", "", "" };
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray4 };
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test428");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test429");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test430");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test431");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test432");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test433");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test434");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test435");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test436");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test437");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test438");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test439");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray8 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray6);
        java.lang.String[][] strArray9 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test440");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void EntityArrays() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test441");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray4);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.String[][] strArray7 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray5);
        java.lang.Class<?> wildcardClass8 = strArray7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }
}

