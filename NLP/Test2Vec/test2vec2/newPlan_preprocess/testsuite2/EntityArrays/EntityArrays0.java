package EntityArrays;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EntityArrays0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test01");
        org.apache.commons.lang3.text.translate.EntityArrays entityArrays0 = new org.apache.commons.lang3.text.translate.EntityArrays();
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test02");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
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
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test03");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test04");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test05");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
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
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test07");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test08");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test09");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.APOS_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test10");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test11");
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
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test12");
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
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test13");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
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
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test14");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test15");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
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
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test16");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test17");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test18");
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
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test19");
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
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test20");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test21");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE();
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
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test22");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE();
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
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test23");
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
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test24");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE();
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
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test25");
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
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test26");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
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
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test27");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_UNESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test28");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test29");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test30");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test31");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
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
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test32");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.HTML40_EXTENDED_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test33");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
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
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test34");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_ESCAPE();
        java.lang.Class<?> wildcardClass1 = strArray0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test35");
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
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test36");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test37");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
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
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test38");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test39");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
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
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test40");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
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
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test41");
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
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test42");
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
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test43");
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
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test44");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
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
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test45");
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
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test46");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray6 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
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
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test47");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
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
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test48");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        // Regression assertion (captures the current behavior of the code)
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
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test49");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test50");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
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
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test51");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
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
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test52");
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
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test53");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
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
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test54");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test55");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
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
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test56");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test57");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray3);
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
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test58");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test59");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray5 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray0);
        // Regression assertion (captures the current behavior of the code)
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
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test60");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.BASIC_UNESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
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
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test61");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.JAVA_CTRL_CHARS_ESCAPE();
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
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "EntityArrays0.test62");
        java.lang.String[][] strArray0 = org.apache.commons.lang3.text.translate.EntityArrays.ISO8859_1_ESCAPE();
        java.lang.String[][] strArray1 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray0);
        java.lang.String[][] strArray2 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray1);
        java.lang.String[][] strArray3 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
        java.lang.String[][] strArray4 = org.apache.commons.lang3.text.translate.EntityArrays.invert(strArray2);
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
}

