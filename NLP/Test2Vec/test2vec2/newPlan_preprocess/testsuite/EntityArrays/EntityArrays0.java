package EntityArrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EntityArrays0 {

    public static boolean debug = false;

    @Test
    public void EntityArrays001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays001");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays002");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!" };
        java.lang.String[][] strArray4 = new java.lang.String[][] { strArray1, strArray3 };
        // The following exception was thrown during execution in EntityArrays generation
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
    public void EntityArrays003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays003");
        java.lang.String[][] strArray0 = null;
        // The following exception was thrown during execution in EntityArrays generation
        try {
            java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void EntityArrays004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays004");
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
    public void EntityArrays005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays005");
        org.apache.commons.lang3.text.translate.EntityArrays entityArrays0 = new org.apache.commons.lang3.text.translate.EntityArrays();
        java.lang.Class<?> wildcardClass1 = entityArrays0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays006");
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
    public void EntityArrays007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays007");
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
    public void EntityArrays008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays008");
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
    public void EntityArrays009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays009");
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
    public void EntityArrays010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays010");
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
    public void EntityArrays011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays011");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays012");
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
    public void EntityArrays013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays013");
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
    public void EntityArrays014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays014");
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
    public void EntityArrays015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays015");
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
    public void EntityArrays016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays016");
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
    public void EntityArrays017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays017");
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
    public void EntityArrays018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays018");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays019");
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
    public void EntityArrays020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays020");
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
    public void EntityArrays021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays021");
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
    public void EntityArrays022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays022");
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
    public void EntityArrays023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays023");
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
    public void EntityArrays024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays024");
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
    public void EntityArrays025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays025");
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
    public void EntityArrays026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays026");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays027");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays028");
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
    public void EntityArrays029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays029");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays030");
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
    public void EntityArrays031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays031");
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
    public void EntityArrays032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays032");
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
    public void EntityArrays033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays033");
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
    public void EntityArrays034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays034");
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
    public void EntityArrays035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays035");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays036");
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
    public void EntityArrays037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays037");
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
    public void EntityArrays038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays038");
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
    public void EntityArrays039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays039");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays040");
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
    public void EntityArrays041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays041");
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
    public void EntityArrays042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays042");
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
    public void EntityArrays043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays043");
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
    public void EntityArrays044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays044");
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
    public void EntityArrays045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays045");
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
    public void EntityArrays046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays046");
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
    public void EntityArrays047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays047");
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
    public void EntityArrays048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays048");
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
    public void EntityArrays049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays049");
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
    public void EntityArrays050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays050");
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
    public void EntityArrays051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays051");
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
    public void EntityArrays052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays052");
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
    public void EntityArrays053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays053");
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
    public void EntityArrays054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays054");
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
    public void EntityArrays055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays055");
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
    public void EntityArrays056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays056");
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
    public void EntityArrays057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays057");
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
    public void EntityArrays058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays058");
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
    public void EntityArrays059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays059");
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
    public void EntityArrays060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays060");
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
    public void EntityArrays061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays061");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays062");
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
    public void EntityArrays063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays063");
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
    public void EntityArrays064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays064");
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
    public void EntityArrays065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays065");
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
    public void EntityArrays066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays066");
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
    public void EntityArrays067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays067");
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
    public void EntityArrays068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays068");
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
    public void EntityArrays069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays069");
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
    public void EntityArrays070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays070");
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
    public void EntityArrays071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays071");
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
    public void EntityArrays072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays072");
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
    public void EntityArrays073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays073");
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
    public void EntityArrays074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays074");
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
    public void EntityArrays075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays075");
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
    public void EntityArrays076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays076");
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
    public void EntityArrays077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays077");
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
    public void EntityArrays078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays078");
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
    public void EntityArrays079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays079");
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
    public void EntityArrays080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays080");
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
    public void EntityArrays081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays081");
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
    public void EntityArrays082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays082");
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
    public void EntityArrays083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays083");
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
    public void EntityArrays084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays084");
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
    public void EntityArrays085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays085");
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
    public void EntityArrays086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays086");
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
    public void EntityArrays087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays087");
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
    public void EntityArrays088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays088");
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
    public void EntityArrays089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays089");
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
    public void EntityArrays090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays090");
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
    public void EntityArrays091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays091");
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
    public void EntityArrays092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays092");
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
    public void EntityArrays093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays093");
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
    public void EntityArrays094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays094");
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
    public void EntityArrays095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays095");
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
    public void EntityArrays096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays096");
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
    public void EntityArrays097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays097");
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
    public void EntityArrays098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays098");
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
    public void EntityArrays099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays099");
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
    public void EntityArrays100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays100");
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
    public void EntityArrays101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays101");
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
    public void EntityArrays102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays102");
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
    public void EntityArrays103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays103");
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
    public void EntityArrays104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays104");
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
    public void EntityArrays105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays105");
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
    public void EntityArrays106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays106");
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
    public void EntityArrays107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays107");
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
    public void EntityArrays108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays108");
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
    public void EntityArrays109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays109");
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
    public void EntityArrays110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays110");
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
    public void EntityArrays111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays111");
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
    public void EntityArrays112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays112");
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
    public void EntityArrays113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays113");
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
    public void EntityArrays114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays114");
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
    public void EntityArrays115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays115");
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
    public void EntityArrays116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays116");
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
    public void EntityArrays117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays117");
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
    public void EntityArrays118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays118");
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
    public void EntityArrays119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays119");
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
    public void EntityArrays120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays120");
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
    public void EntityArrays121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays121");
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
    public void EntityArrays122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays122");
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
    public void EntityArrays123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays123");
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
    public void EntityArrays124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays124");
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
    public void EntityArrays125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays125");
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
    public void EntityArrays126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays126");
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
    public void EntityArrays127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays127");
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
    public void EntityArrays128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays128");
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
    public void EntityArrays129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays129");
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
    public void EntityArrays130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays130");
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
    public void EntityArrays131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays131");
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
    public void EntityArrays132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays132");
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
    public void EntityArrays133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays133");
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
    public void EntityArrays134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays134");
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
    public void EntityArrays135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays135");
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
    public void EntityArrays136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays136");
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
    public void EntityArrays137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays137");
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
    public void EntityArrays138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays138");
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
    public void EntityArrays139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays139");
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
    public void EntityArrays140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays140");
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
    public void EntityArrays141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays141");
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
    public void EntityArrays142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays142");
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
    public void EntityArrays143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays143");
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
    public void EntityArrays144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays144");
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
    public void EntityArrays145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays145");
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
    public void EntityArrays146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays146");
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
    public void EntityArrays147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays147");
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
    public void EntityArrays148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays148");
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
    public void EntityArrays149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays149");
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
    public void EntityArrays150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays150");
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
    public void EntityArrays151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays151");
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
    public void EntityArrays152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays152");
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
    public void EntityArrays153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays153");
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
    public void EntityArrays154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays154");
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
    public void EntityArrays155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays155");
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
    public void EntityArrays156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays156");
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
    public void EntityArrays157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays157");
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
    public void EntityArrays158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays158");
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
    public void EntityArrays159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays159");
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
    public void EntityArrays160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays160");
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
    public void EntityArrays161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays161");
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
    public void EntityArrays162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays162");
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
    public void EntityArrays163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays163");
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
    public void EntityArrays164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays164");
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
    public void EntityArrays165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays165");
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
    public void EntityArrays166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays166");
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
    public void EntityArrays167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays167");
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
    public void EntityArrays168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays168");
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
    public void EntityArrays169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays169");
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
    public void EntityArrays170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays170");
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
    public void EntityArrays171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays171");
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
    public void EntityArrays172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays172");
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
    public void EntityArrays173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays173");
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
    public void EntityArrays174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays174");
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
    public void EntityArrays175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays175");
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
    public void EntityArrays176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays176");
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
    public void EntityArrays177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays177");
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
    public void EntityArrays178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays178");
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
    public void EntityArrays179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays179");
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
    public void EntityArrays180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays180");
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
    public void EntityArrays181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays181");
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
    public void EntityArrays182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays182");
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
    public void EntityArrays183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays183");
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
    public void EntityArrays184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays184");
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
    public void EntityArrays185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays185");
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
    public void EntityArrays186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays186");
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
    public void EntityArrays187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays187");
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
    public void EntityArrays188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays188");
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
    public void EntityArrays189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays189");
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
    public void EntityArrays190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays190");
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
    public void EntityArrays191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays191");
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
    public void EntityArrays192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays192");
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
    public void EntityArrays193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays193");
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
    public void EntityArrays194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays194");
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
    public void EntityArrays195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays195");
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
    public void EntityArrays196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays196");
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
    public void EntityArrays197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays197");
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
    public void EntityArrays198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays198");
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
    public void EntityArrays199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays199");
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
    public void EntityArrays200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays200");
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
    public void EntityArrays201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays201");
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
    public void EntityArrays202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays202");
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
    public void EntityArrays203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays203");
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
    public void EntityArrays204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays204");
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
    public void EntityArrays205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays205");
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
    public void EntityArrays206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays206");
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
    public void EntityArrays207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays207");
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
    public void EntityArrays208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays208");
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
    public void EntityArrays209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays209");
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
    public void EntityArrays210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays210");
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
    public void EntityArrays211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays211");
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
    public void EntityArrays212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays212");
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
    public void EntityArrays213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays213");
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
    public void EntityArrays214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays214");
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
    public void EntityArrays215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays215");
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
    public void EntityArrays216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays216");
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
    public void EntityArrays217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays217");
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
    public void EntityArrays218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays218");
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
    public void EntityArrays219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays219");
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
    public void EntityArrays220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays220");
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
    public void EntityArrays221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays221");
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
    public void EntityArrays222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays222");
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
    public void EntityArrays223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays223");
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
    public void EntityArrays224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays224");
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
    public void EntityArrays225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays225");
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
    public void EntityArrays226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays226");
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
    public void EntityArrays227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays227");
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
    public void EntityArrays228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays228");
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
    public void EntityArrays229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays229");
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
    public void EntityArrays230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays230");
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
    public void EntityArrays231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays231");
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
    public void EntityArrays232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays232");
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
    public void EntityArrays233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays233");
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
    public void EntityArrays234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays234");
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
    public void EntityArrays235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays235");
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
    public void EntityArrays236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays236");
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
    public void EntityArrays237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays237");
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
    public void EntityArrays238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays238");
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
    public void EntityArrays239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays239");
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
    public void EntityArrays240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays240");
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
    public void EntityArrays241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays241");
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
    public void EntityArrays242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays242");
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
    public void EntityArrays243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays243");
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
    public void EntityArrays244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays244");
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
    public void EntityArrays245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays245");
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
    public void EntityArrays246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays246");
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
    public void EntityArrays247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays247");
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
    public void EntityArrays248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays248");
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
    public void EntityArrays249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays249");
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
    public void EntityArrays250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays250");
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
    public void EntityArrays251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays251");
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
    public void EntityArrays252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays252");
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
    public void EntityArrays253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays253");
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
    public void EntityArrays254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays254");
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
    public void EntityArrays255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays255");
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
    public void EntityArrays256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays256");
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
    public void EntityArrays257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays257");
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
    public void EntityArrays258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays258");
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
    public void EntityArrays259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays259");
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
    public void EntityArrays260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays260");
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
    public void EntityArrays261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays261");
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
    public void EntityArrays262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays262");
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
    public void EntityArrays263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays263");
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
    public void EntityArrays264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays264");
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
    public void EntityArrays265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays265");
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
    public void EntityArrays266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays266");
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
    public void EntityArrays267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays267");
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
    public void EntityArrays268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays268");
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
    public void EntityArrays269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays269");
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
    public void EntityArrays270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays270");
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
    public void EntityArrays271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays271");
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
    public void EntityArrays272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays272");
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
    public void EntityArrays273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays273");
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
    public void EntityArrays274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays274");
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
    public void EntityArrays275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays275");
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
    public void EntityArrays276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays276");
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
    public void EntityArrays277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays277");
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
    public void EntityArrays278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays278");
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
    public void EntityArrays279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays279");
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
    public void EntityArrays280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays280");
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
    public void EntityArrays281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays281");
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
    public void EntityArrays282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays282");
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
    public void EntityArrays283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays283");
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
    public void EntityArrays284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays284");
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
    public void EntityArrays285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays285");
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
    public void EntityArrays286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays286");
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
    public void EntityArrays287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays287");
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
    public void EntityArrays288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays288");
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
    public void EntityArrays289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays289");
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
    public void EntityArrays290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays290");
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
    public void EntityArrays291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays291");
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
    public void EntityArrays292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays292");
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
    public void EntityArrays293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays293");
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
    public void EntityArrays294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays294");
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
    public void EntityArrays295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays295");
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
    public void EntityArrays296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays296");
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
    public void EntityArrays297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays297");
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
    public void EntityArrays298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays298");
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
    public void EntityArrays299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays299");
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
    public void EntityArrays300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays300");
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
    public void EntityArrays301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays301");
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
    public void EntityArrays302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays302");
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
    public void EntityArrays303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays303");
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
    public void EntityArrays304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays304");
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
    public void EntityArrays305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays305");
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
    public void EntityArrays306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays306");
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
    public void EntityArrays307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays307");
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
    public void EntityArrays308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays308");
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
    public void EntityArrays309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays309");
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
    public void EntityArrays310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays310");
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
    public void EntityArrays311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays311");
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
    public void EntityArrays312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays312");
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
    public void EntityArrays313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays313");
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
    public void EntityArrays314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays314");
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
    public void EntityArrays315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays315");
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
    public void EntityArrays316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays316");
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
    public void EntityArrays317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays317");
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
    public void EntityArrays318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays318");
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
    public void EntityArrays319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays319");
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
    public void EntityArrays320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays320");
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
    public void EntityArrays321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays321");
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
    public void EntityArrays322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays322");
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
    public void EntityArrays323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays323");
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
    public void EntityArrays324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays324");
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
    public void EntityArrays325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays325");
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
    public void EntityArrays326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays326");
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
    public void EntityArrays327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays327");
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
    public void EntityArrays328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays328");
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
    public void EntityArrays329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays329");
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
    public void EntityArrays330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays330");
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
    public void EntityArrays331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays331");
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
    public void EntityArrays332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays332");
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
    public void EntityArrays333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays333");
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
    public void EntityArrays334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays334");
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
    public void EntityArrays335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays335");
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
    public void EntityArrays336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays336");
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
    public void EntityArrays337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays337");
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
    public void EntityArrays338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays338");
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
    public void EntityArrays339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays339");
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
    public void EntityArrays340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays340");
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
    public void EntityArrays341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays341");
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
    public void EntityArrays342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays342");
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
    public void EntityArrays343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays343");
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
    public void EntityArrays344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays344");
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
    public void EntityArrays345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays345");
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
    public void EntityArrays346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays346");
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
    public void EntityArrays347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays347");
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
    public void EntityArrays348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays348");
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
    public void EntityArrays349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays349");
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
    public void EntityArrays350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays350");
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
    public void EntityArrays351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays351");
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
    public void EntityArrays352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays352");
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
    public void EntityArrays353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays353");
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
    public void EntityArrays354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays354");
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
    public void EntityArrays355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays355");
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
    public void EntityArrays356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays356");
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
    public void EntityArrays357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays357");
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
    public void EntityArrays358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays358");
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
    public void EntityArrays359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays359");
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
    public void EntityArrays360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays360");
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
    public void EntityArrays361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays361");
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
    public void EntityArrays362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays362");
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
    public void EntityArrays363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays363");
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
    public void EntityArrays364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays364");
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
    public void EntityArrays365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays365");
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
    public void EntityArrays366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays366");
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
    public void EntityArrays367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays367");
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
    public void EntityArrays368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays368");
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
    public void EntityArrays369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays369");
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
    public void EntityArrays370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays370");
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
    public void EntityArrays371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays371");
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
    public void EntityArrays372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays372");
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
    public void EntityArrays373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays373");
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
    public void EntityArrays374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays374");
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
    public void EntityArrays375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays375");
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
    public void EntityArrays376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays376");
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
    public void EntityArrays377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays377");
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
    public void EntityArrays378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays378");
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
    public void EntityArrays379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays379");
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
    public void EntityArrays380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays380");
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
    public void EntityArrays381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays381");
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
    public void EntityArrays382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays382");
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
    public void EntityArrays383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays383");
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
    public void EntityArrays384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays384");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void EntityArrays385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays385");
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
    public void EntityArrays386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays386");
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
    public void EntityArrays387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays387");
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
    public void EntityArrays388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays388");
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
    public void EntityArrays389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays389");
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
    public void EntityArrays390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays390");
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
    public void EntityArrays391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays391");
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
    public void EntityArrays392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays392");
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
    public void EntityArrays393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays393");
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
    public void EntityArrays394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays394");
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
    public void EntityArrays395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays395");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays396");
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
    public void EntityArrays397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays397");
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
    public void EntityArrays398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays398");
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
    public void EntityArrays399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays399");
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
    public void EntityArrays400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays400");
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
    public void EntityArrays401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays401");
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
    public void EntityArrays402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays402");
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
    public void EntityArrays403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays403");
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
    public void EntityArrays404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays404");
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
    public void EntityArrays405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays405");
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
    public void EntityArrays406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays406");
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
    public void EntityArrays407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays407");
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
    public void EntityArrays408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays408");
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
    public void EntityArrays409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays409");
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
    public void EntityArrays410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays410");
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
    public void EntityArrays411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays411");
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
    public void EntityArrays412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays412");
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
    public void EntityArrays413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays413");
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
    public void EntityArrays414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays414");
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
    public void EntityArrays415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays415");
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
    public void EntityArrays416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays416");
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
    public void EntityArrays417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays417");
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
    public void EntityArrays418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays418");
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
    public void EntityArrays419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays419");
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
    public void EntityArrays420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays420");
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
    public void EntityArrays421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays421");
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
    public void EntityArrays422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays422");
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
    public void EntityArrays423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays423");
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
    public void EntityArrays424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays424");
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
    public void EntityArrays425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays425");
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
    public void EntityArrays426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays426");
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
    public void EntityArrays427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays427");
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
    public void EntityArrays428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays428");
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
    public void EntityArrays429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays429");
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
    public void EntityArrays430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays430");
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
    public void EntityArrays431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays431");
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
    public void EntityArrays432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays432");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void EntityArrays433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays433");
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
    public void EntityArrays434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays434");
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
    public void EntityArrays435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays435");
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
    public void EntityArrays436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays436");
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
    public void EntityArrays437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays437");
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
    public void EntityArrays438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays438");
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
    public void EntityArrays439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays439");
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
    public void EntityArrays440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays440");
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
    public void EntityArrays441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.EntityArrays441");
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

