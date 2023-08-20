
package StrBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrBuilder0 {

    public static boolean debug = false;

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test001");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.deleteCharAt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test002");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.insert(1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test003");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        char[] charArray3 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(charArray3, (-1), (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test004");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.Class<?> wildcardClass4 = strBuilder3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test005");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.insert((int) (byte) 10, (double) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test006");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        java.lang.StringBuilder stringBuilder6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.append(stringBuilder6, (int) (short) -1, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test007");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.insert((-1), true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test008");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.append((java.lang.Object) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test009");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = strBuilder0.substring((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test010");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.insert((-1), (java.lang.Object) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test011");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.insert((int) (short) -1, charArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test012");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        java.lang.String str9 = strBuilder7.substring((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1\r\n" + "'", str9.equals("1\r\n"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test013");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test014");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.setNullText("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test015");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.replace((int) (short) 100, (int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test016");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append((java.lang.Object) (-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test017");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        java.lang.String str9 = strBuilder7.rightString((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test018");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.insert(100, (double) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test019");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        java.lang.String str8 = strBuilder4.build();
        java.io.Reader reader9 = strBuilder4.asReader();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test020");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence5 = strBuilder2.subSequence((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test021");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        int int9 = strBuilder7.lastIndexOf('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test022");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        int int9 = strBuilder0.indexOf(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test023");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        java.lang.StringBuilder stringBuilder6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.append(stringBuilder6, (int) (byte) 100, (int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test024");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln((float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test025");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.appendln(stringBuffer6, (int) (byte) -1, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test026");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        boolean boolean9 = strBuilder0.equals((java.lang.Object) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test027");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder5.delete((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test028");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strBuilder3.substring((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test029");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        java.lang.StringBuffer stringBuffer8 = strBuilder7.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test030");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.setNullText("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test031");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.replace(strMatcher4, "1", (int) (short) 1, 100, (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test032");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.append('#');
        int int9 = strBuilder7.indexOf("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test033");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        boolean boolean8 = strBuilder6.endsWith("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test034");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        int int9 = strBuilder0.indexOf(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test035");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln((double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test036");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strBuilder5.substring((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test037");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        boolean boolean2 = strBuilder1.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test038");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder5.replaceAll(strMatcher6, "1");
        char[] charArray9 = strBuilder5.toCharArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test039");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.append((int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test040");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        char[] charArray9 = strBuilder2.toCharArray(0, (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test041");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.replaceFirst(strMatcher5, "hi!");
        char[] charArray8 = strBuilder4.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder3.appendln(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test042");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            char char5 = strBuilder3.charAt((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test043");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.trim();
        java.util.stream.IntStream intStream9 = strBuilder8.chars();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test044");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator("hi!", (int) (byte) 100);
        int int9 = strBuilder7.indexOf("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test045");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.setLength((int) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test046");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.append(stringBuffer6);
        int int9 = strBuilder5.lastIndexOf("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test047");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        char[] charArray8 = strBuilder0.toCharArray(0, (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test048");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder();
        int int4 = strBuilder1.indexOf("hi!", 0);
        java.lang.String str5 = strBuilder1.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.setNullText("hi!");
        java.lang.StringBuilder stringBuilder8 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.appendln(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test049");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.deleteAll("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test050");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append("", (-1), (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test051");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.appendSeparator("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test052");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert((-1), (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test053");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendln("1\r\n", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test054");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.deleteAll('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test055");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst('4', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test056");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (short) 0);
        boolean boolean9 = strBuilder0.contains("1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test057");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        // The following exception was thrown during execution in test generation
        try {
            char char3 = strBuilder0.charAt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test058");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test059");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        java.lang.String str7 = strBuilder1.build();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strBuilder1.substring(10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test060");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher5, 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.reverse();
        int int9 = strBuilder0.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test061");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder5.insert((int) (byte) 0, false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test062");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.ensureCapacity((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.insert(1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test063");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.setCharAt((int) '4', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test064");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.insert((int) 'a', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test065");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        int int7 = strBuilder4.indexOf("hi!", 0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strBuilder4.asTokenizer();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder1.appendAll((java.util.Iterator<java.lang.String>) strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test066");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.append(stringBuffer6);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.append((java.lang.Object) 1L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test067");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("", 100, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test068");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.setCharAt((-1), '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test069");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence8 = strBuilder5.subSequence((int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test070");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append(obj7);
        java.util.stream.IntStream intStream9 = strBuilder6.codePoints();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test071");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator("hi!", (int) (byte) 100);
        boolean boolean9 = strBuilder0.contains("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test072");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test073");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert((int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test074");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder();
        int int4 = strBuilder1.indexOf("hi!", 0);
        java.lang.String str5 = strBuilder1.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.setNullText("hi!");
        java.lang.StringBuilder stringBuilder8 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.append(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test075");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replace(strMatcher1, "1\r\n", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.append("");
        java.lang.String str9 = strBuilder0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test076");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.insert((int) (short) 1, (int) (short) -1);
        int int9 = strBuilder8.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test077");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.deleteAll('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.replaceFirst(strMatcher5, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder3.appendln((java.lang.Object) strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test078");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        char[] charArray7 = new char[] { '4' };
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.insert((int) '#', charArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test079");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.appendln((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test080");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replace(strMatcher1, "1\r\n", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteAll(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test081");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (short) 0);
        java.lang.Class<?> wildcardClass8 = strBuilder7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test082");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        java.lang.StringBuffer stringBuffer8 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test083");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.insert((int) (short) 0, '4');
        java.io.Writer writer8 = strBuilder0.asWriter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test084");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        int int5 = strBuilder2.lastIndexOf("", 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln(0.0f);
        int int9 = strBuilder2.indexOf("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test085");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.append('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder2.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test086");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        java.lang.String str8 = strBuilder5.getNewLineText();
        java.lang.Class<?> wildcardClass9 = strBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test087");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        int int6 = strBuilder0.lastIndexOf('#');
        int int9 = strBuilder0.lastIndexOf('4', (int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test088");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.setNewLineText("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test089");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replaceAll('#', '4');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.ensureCapacity((int) '4');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test090");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln('a');
        int int8 = strBuilder7.capacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test091");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = strBuilder0.substring(32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test092");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replaceAll('#', '4');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.ensureCapacity((int) '4');
        java.lang.StringBuffer stringBuffer9 = strBuilder8.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer9.toString(), "");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test093");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (short) 0);
        int int8 = strBuilder7.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 57 + "'", int8 == 57);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test094");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        java.lang.String str2 = strBuilder1.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test095");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        boolean boolean9 = strBuilder7.contains(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test096");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append("\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test097");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.appendFixedWidthPadLeft((int) (short) -1, (int) ' ', '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.delete(10, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test098");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test099");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.replaceAll(strMatcher4, "hi!");
        java.lang.String str8 = strBuilder6.leftString((int) (short) 1);
        int int9 = strBuilder6.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1" + "'", str8.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test100");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.trim();
        int int9 = strBuilder8.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test101");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder6.lastIndexOf(strMatcher7, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test102");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendPadding(10, 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test103");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = strBuilder0.substring(57);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test104");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.ensureCapacity((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder5.setCharAt((int) (short) -1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test105");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder0.indexOf(strMatcher3, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.deleteCharAt((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test106");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln("");
        java.io.Reader reader8 = strBuilder2.asReader();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test107");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.ensureCapacity((int) (byte) 100);
        java.lang.Class<?> wildcardClass6 = strBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test108");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher5, 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.reverse();
        boolean boolean9 = strBuilder8.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test109");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.ensureCapacity((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test110");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.reverse();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.deleteAll(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test111");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln('a');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        int int9 = strBuilder0.lastIndexOf(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test112");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        // The following exception was thrown during execution in test generation
        try {
            char char7 = strBuilder0.charAt(57);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test113");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert(6, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test114");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        java.lang.String str7 = strBuilder1.build();
        java.lang.String str9 = strBuilder1.leftString((int) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test115");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendln('#');
        java.lang.String str9 = strBuilder8.getNewLineText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test116");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.ensureCapacity((int) (byte) 100);
        java.lang.String str8 = strBuilder0.midString(0, 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test117");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        java.lang.String str7 = strBuilder2.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.appendln((java.lang.Object) "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test118");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        java.lang.String str7 = strBuilder1.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder1.appendln((double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test119");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append((float) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test120");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.insert(3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test121");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert(0, "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test122");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        int int9 = strBuilder1.lastIndexOf("hi!", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test123");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strBuilder0.substring((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test124");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher6);
        boolean boolean9 = strBuilder0.startsWith("1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test125");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln("");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append((long) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test126");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher5, 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.trim();
        java.lang.Class<?> wildcardClass9 = strBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test127");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        java.lang.String str8 = strBuilder6.rightString((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test128");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("1#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test129");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        char char8 = strBuilder6.charAt((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\r' + "'", char8 == '\r');
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test130");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendSeparator('a', '#');
        boolean boolean8 = strBuilder0.contains("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test131");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendSeparator('a', '#');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test132");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test133");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        boolean boolean3 = strBuilder1.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test134");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.insert(32, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test135");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray4 = strBuilder0.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll("\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.replaceFirst('a', '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test136");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher6);
        java.lang.StringBuilder stringBuilder8 = strBuilder0.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "14");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test137");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.insert((int) (byte) 100, (double) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test138");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        java.lang.String str8 = strBuilder4.substring((int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "4" + "'", str8.equals("4"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test139");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendln((int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test140");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.insert((int) (short) 0, '4');
        java.lang.StringBuffer stringBuffer8 = strBuilder7.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test141");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder5.lastIndexOf(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test142");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        int int6 = strBuilder0.indexOf(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.append(6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test143");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.deleteAll('#');
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.insert((int) (short) -1, obj5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test144");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.replaceAll(strMatcher4, "hi!");
        java.lang.String str8 = strBuilder3.substring((int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0.0\r\n" + "'", str8.equals("0.0\r\n"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test145");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        char[] charArray7 = new char[] { '#' };
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.appendln(charArray7);
        java.lang.StringBuilder stringBuilder9 = strBuilder8.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "14#\r\n");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test146");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        int int8 = strBuilder7.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test147");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        java.lang.String str7 = strBuilder2.getNullText();
        int int8 = strBuilder2.length();
        java.lang.String str9 = strBuilder2.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test148");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendSeparator('a', '#');
        java.lang.String str9 = strBuilder6.midString(0, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test149");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln("");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.setLength(6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test150");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strBuilder0.asTokenizer();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test151");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.setNewLineText("1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        boolean boolean7 = strBuilder5.contains(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.append(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test152");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.appendln((float) '4');
        int int9 = strBuilder8.capacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test153");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append((float) 0L);
        java.lang.Class<?> wildcardClass9 = strBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test154");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendSeparator('a', 3);
        int int8 = strBuilder1.lastIndexOf('a', (int) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test155");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        int int9 = strBuilder0.lastIndexOf("", 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test156");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        java.io.Writer writer8 = strBuilder7.asWriter();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test157");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.reverse();
        java.lang.String str8 = strBuilder6.getNewLineText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test158");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        java.lang.String str7 = strBuilder0.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.append((float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test159");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        java.lang.String str7 = strBuilder0.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.appendln("1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test160");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.deleteCharAt(57);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test161");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test162");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append((float) ' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.appendSeparator('a', (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test163");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        boolean boolean7 = strBuilder0.startsWith("1#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test164");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test165");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.minimizeCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test166");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        char[] charArray7 = strBuilder2.toCharArray();
        boolean boolean9 = strBuilder2.contains("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test167");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.deleteAll(strMatcher6);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        boolean boolean9 = strBuilder5.contains(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test168");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        java.lang.StringBuilder stringBuilder7 = strBuilder6.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.minimizeCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test169");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.insert((int) (short) 1, (int) (short) -1);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test170");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst("1", "");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.minimizeCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test171");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder3.setNullText("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test172");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.deleteCharAt(3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 3");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test173");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test174");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strBuilder0.asTokenizer();
        int int6 = strBuilder0.lastIndexOf("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.reverse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test175");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int8 = strBuilder6.indexOf(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test176");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strBuilder0.asTokenizer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator('a', '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.reverse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test177");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.Object[] objArray4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder6.indexOf(strMatcher7, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test178");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder0.getNewLineText();
        java.util.stream.IntStream intStream6 = strBuilder0.chars();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test179");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.replaceFirst('#', '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append(1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test180");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replaceAll('#', '4');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder6.indexOf(strMatcher7, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test181");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.setLength((int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendSeparator("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test182");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        int int6 = strBuilder0.lastIndexOf('#');
        int int7 = strBuilder0.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test183");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        int int4 = strBuilder1.indexOf(strMatcher2, (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test184");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replace(strMatcher1, "1\r\n", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append((-1));
        java.lang.StringBuilder stringBuilder9 = strBuilder6.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "-1");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test185");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder3.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test186");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str4 = strBuilder2.rightString((int) (byte) -1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder2.appendFixedWidthPadRight((int) '4', 32, '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test187");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.insert(32, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test188");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append((float) ' ');
        boolean boolean8 = strBuilder0.endsWith("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test189");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNewLineText("1");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.deleteAll(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test190");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.trim();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test191");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        int int8 = strBuilder0.indexOf(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test192");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strBuilder0.asTokenizer();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = strBuilder0.equalsIgnoreCase(strBuilder5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test193");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((double) 0L);
        java.util.stream.IntStream intStream7 = strBuilder6.chars();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test194");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        int int8 = strBuilder0.indexOf("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test195");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder3.insert(1, (long) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test196");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendSeparator("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test197");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.deleteFirst('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test198");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        int int8 = strBuilder6.lastIndexOf('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test199");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        java.lang.String str7 = strBuilder0.build();
        boolean boolean9 = strBuilder0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test200");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator("hi!", (int) (byte) 100);
        int int8 = strBuilder7.capacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test201");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        char char8 = strBuilder6.charAt(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '1' + "'", char8 == '1');
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test202");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(3);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.replaceFirst(strMatcher3, "hi!");
        char[] charArray6 = strBuilder2.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.appendln(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test203");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.append("4", (int) ' ', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test204");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        int int9 = strBuilder7.lastIndexOf("1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test205");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append((float) 0L);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.minimizeCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test206");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNewLineText("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test207");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        java.lang.CharSequence charSequence7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.append(charSequence7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test208");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.append((float) (byte) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.setNullText("0.0\r\n");
        boolean boolean8 = strBuilder6.contains('1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test209");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        int int8 = strBuilder4.lastIndexOf("1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test210");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder4.getNullText();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder4.lastIndexOf(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst("\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test211");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator("hi!", (int) (byte) 100);
        java.util.stream.IntStream intStream8 = strBuilder7.codePoints();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test212");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.replaceAll(strMatcher4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder3.setNullText("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test213");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (byte) 100, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test214");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.append(0.0f);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test215");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst(strMatcher7);
        int int9 = strBuilder8.capacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test216");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendSeparator('a', 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.appendln((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder1.setNullText("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test217");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        int int5 = strBuilder1.lastIndexOf('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test218");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        int int5 = strBuilder2.lastIndexOf("", 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln(0.0f);
        // The following exception was thrown during execution in test generation
        try {
            char char9 = strBuilder2.charAt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test219");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder5.insert((int) (short) 0, '4');
        boolean boolean9 = strBuilder8.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test220");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.Object[] objArray4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = strBuilder0.substring((int) '\r');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test221");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.append("\n", (int) (short) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test222");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.reverse();
        int int8 = strBuilder6.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test223");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replace(strMatcher1, "1\r\n", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        int int8 = strBuilder6.lastIndexOf('a');
        java.lang.StringBuffer stringBuffer9 = strBuilder6.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer9.toString(), "");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test224");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        int int5 = strBuilder1.indexOf('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder1.lastIndexOf(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test225");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder4.getNullText();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.reverse();
        java.lang.StringBuffer stringBuffer8 = strBuilder4.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "\n\r41");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test226");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.append(stringBuffer6);
        java.util.stream.IntStream intStream8 = strBuilder7.codePoints();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test227");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.appendln((int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test228");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        int int6 = strBuilder1.indexOf("1\r\n", (int) '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test229");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.appendSeparator(' ', ' ');
        org.apache.commons.lang3.text.StrTokenizer strTokenizer9 = strBuilder8.asTokenizer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test230");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test231");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        java.util.stream.IntStream intStream5 = strBuilder0.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln("1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        boolean boolean9 = strBuilder7.contains(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test232");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.ensureCapacity((int) ' ');
        java.lang.Class<?> wildcardClass9 = strBuilder8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test233");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator("hi!", (int) (byte) 100);
        boolean boolean9 = strBuilder0.endsWith("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test234");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.replaceAll(strMatcher4, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = strBuilder6.subSequence(100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test235");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        java.io.Reader reader8 = strBuilder0.asReader();
        java.lang.String str9 = strBuilder0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test236");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher5, 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.minimizeCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test237");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.setLength((int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.trim();
        int int9 = strBuilder8.capacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test238");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.appendNewLine();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst(strMatcher7, "1#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test239");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.appendFixedWidthPadLeft((int) (short) -1, (int) ' ', '#');
        java.lang.StringBuffer stringBuffer7 = strBuilder2.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "##############################-1");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test240");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replaceAll('#', '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert((int) (byte) 10, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test241");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        char[] charArray8 = strBuilder4.toCharArray();
        java.lang.String str9 = strBuilder4.getNewLineText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test242");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        java.lang.String str7 = strBuilder2.leftString((int) (short) 1);
        int int9 = strBuilder2.indexOf("1#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test243");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendSeparator('a', '#');
        char char8 = strBuilder6.charAt((int) (byte) 1);
        java.util.stream.IntStream intStream9 = strBuilder6.codePoints();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test244");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = new org.apache.commons.lang3.text.StrBuilder();
        int int6 = strBuilder3.lastIndexOf("1#", (int) (byte) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder3.append("1#");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.append((java.lang.CharSequence) strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test245");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = strBuilder1.substring(52);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test246");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray4 = strBuilder0.getChars(charArray3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator('4', (int) '\r');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.ensureCapacity((int) 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test247");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) '4');
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test248");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.appendln((double) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test249");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.deleteAll(strMatcher6);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer8 = strBuilder7.asTokenizer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test250");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.append("", 10, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test251");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll(strMatcher5);
        int int8 = strBuilder0.lastIndexOf('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test252");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln(strBuilder4);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder3.append("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test253");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        boolean boolean2 = strBuilder1.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test254");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.setNewLineText("1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder5.insert((int) (short) 0, (float) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test255");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendNull();
        java.lang.String str7 = strBuilder0.getNewLineText();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.deleteAll(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test256");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        java.lang.StringBuilder stringBuilder7 = strBuilder0.toStringBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.deleteFirst(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test257");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceAll(strMatcher2, "1#");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.setNullText("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test258");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((double) 0L);
        java.lang.Class<?> wildcardClass7 = strBuilder6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test259");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        int int6 = strBuilder5.size();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.replaceFirst(strMatcher7, "\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test260");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        char[] charArray7 = strBuilder0.toCharArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test261");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.appendln(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test262");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        int int9 = strBuilder0.lastIndexOf('#', (int) '4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test263");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.ensureCapacity((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.append("1", (int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test264");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst("hi!", "");
        java.lang.StringBuilder stringBuilder5 = strBuilder4.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1#");
        java.lang.StringBuffer stringBuffer8 = strBuilder4.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "1");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test265");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.insert(0, 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.delete(32, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test266");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.append('#');
        java.lang.String str8 = strBuilder7.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "1#" + "'", str8.equals("1#"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test267");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder0.lastIndexOf("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = new org.apache.commons.lang3.text.StrBuilder();
        char[] charArray7 = new char[] { 'a', '#' };
        char[] charArray8 = strBuilder4.getChars(charArray7);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.append(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test268");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.setLength((int) 'a');
        java.lang.String str6 = strBuilder3.getNewLineText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test269");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray4 = strBuilder0.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll("\r\n");
        java.lang.String str8 = strBuilder6.leftString((int) '\r');
        int int9 = strBuilder6.capacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test270");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strBuilder4.substring((int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test271");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.ensureCapacity((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            char char7 = strBuilder0.charAt(57);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test272");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst("1#", "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test273");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert((-1), (double) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test274");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray4 = strBuilder0.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll("\r\n");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.deleteCharAt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test275");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.deleteAll("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test276");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        java.lang.StringBuilder stringBuilder4 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendNewLine();
        java.lang.String str6 = strBuilder5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1\r\n" + "'", str6.equals("1\r\n"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test277");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.insert((int) (byte) -1, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test278");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.appendln(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test279");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((double) 0L);
        java.lang.StringBuffer stringBuffer7 = strBuilder6.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "0.0\r\n");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test280");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((double) 0L);
        int int7 = strBuilder0.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test281");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.trim();
        java.lang.String str8 = strBuilder0.substring(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test282");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        int int5 = strBuilder2.lastIndexOf("", 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln(0.0f);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder2.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test283");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.setNewLineText("1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.deleteFirst("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test284");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst("1", "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test285");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        java.io.Reader reader8 = strBuilder0.asReader();
        java.lang.String str9 = strBuilder0.getNewLineText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test286");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln("1#");
        boolean boolean9 = strBuilder7.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test287");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder1.deleteFirst(strMatcher7);
        int int9 = strBuilder8.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test288");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((double) 0L);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.appendNewLine();
        boolean boolean8 = strBuilder7.isEmpty();
        java.lang.String str9 = strBuilder7.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test289");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((double) 0L);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.appendNewLine();
        int int9 = strBuilder6.lastIndexOf("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test290");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert(0, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test291");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.insert(0, 'a');
        java.lang.String str8 = strBuilder3.substring(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test292");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        java.lang.String str5 = strBuilder0.rightString(10);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.appendFixedWidthPadRight((int) (short) 10, (int) (byte) 100, '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test293");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        int int7 = strBuilder4.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test294");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.insert(1, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test295");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendNull();
        java.lang.String str7 = strBuilder0.getNewLineText();
        java.util.stream.IntStream intStream8 = strBuilder0.codePoints();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test296");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append("1");
        java.lang.String str8 = strBuilder6.leftString((int) (byte) -1);
        int int9 = strBuilder6.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test297");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray4 = strBuilder0.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll("\r\n");
        java.lang.String str7 = strBuilder0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test298");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder0.lastIndexOf(strMatcher5, 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.reverse();
        java.lang.Class<?> wildcardClass9 = strBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test299");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst("hi!", "");
        java.lang.StringBuilder stringBuilder5 = strBuilder4.toStringBuilder();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strBuilder4.asTokenizer();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.appendln((float) ' ');
        java.lang.String str9 = strBuilder4.getNewLineText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test300");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder3.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.append("\r\n", 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test301");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendSeparator("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test302");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln("");
        java.lang.StringBuilder stringBuilder8 = strBuilder2.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.reverse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test303");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replace(strMatcher1, "1\r\n", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test304");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.clear();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test305");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str7 = strBuilder4.midString((int) ' ', (int) (short) 100);
        boolean boolean8 = strBuilder4.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test306");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        java.lang.String str2 = strBuilder0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test307");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.insert(0, 'a');
        int int9 = strBuilder3.lastIndexOf('a', 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test308");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        int int3 = strBuilder1.lastIndexOf('a');
        java.util.stream.IntStream intStream4 = strBuilder1.codePoints();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test309");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.appendNewLine();
        boolean boolean9 = strBuilder7.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test310");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) (byte) 10);
        java.lang.StringBuilder stringBuilder2 = strBuilder1.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test311");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.trim();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test312");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.Object[] objArray4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "");
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteAll(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test313");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str7 = strBuilder4.midString((int) ' ', (int) (short) 100);
        int int9 = strBuilder4.indexOf("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test314");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst("hi!", "");
        java.lang.StringBuilder stringBuilder5 = strBuilder4.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1#");
        java.lang.String str8 = strBuilder4.getNewLineText();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test315");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.deleteAll(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.setNullText("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test316");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        boolean boolean7 = strBuilder0.contains(strMatcher6);
        boolean boolean8 = strBuilder0.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test317");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder5.reverse();
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int8 = strBuilder5.indexOf(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test318");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.append((long) 57);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.setLength((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test319");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replace(strMatcher1, "1\r\n", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteFirst('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test320");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.setLength((int) (short) 1);
        java.lang.String str9 = strBuilder7.leftString((int) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1" + "'", str9.equals("1"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test321");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        java.lang.String str2 = strBuilder1.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test322");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.deleteCharAt(52);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test323");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln("");
        int int8 = strBuilder7.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test324");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendSeparator('a', 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.appendln("1#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test325");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        int int6 = strBuilder2.lastIndexOf("4", 6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test326");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        java.lang.String str5 = strBuilder0.rightString(10);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.trim();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test327");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert(0, 100);
        int int6 = strBuilder1.lastIndexOf("1#");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.reverse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test328");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.appendFixedWidthPadLeft((int) (short) -1, (int) ' ', '#');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder6.lastIndexOf(strMatcher7, 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test329");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1\r\n");
        char[] charArray3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (short) 10, charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test330");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln("", (int) (short) 1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test331");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        char[] charArray4 = strBuilder2.toCharArray();
        java.lang.String str5 = strBuilder2.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test332");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.setLength((int) 'a');
        int int8 = strBuilder3.indexOf('1', (int) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test333");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1#");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test334");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.appendFixedWidthPadRight(3, (-1), 'a');
        java.lang.StringBuilder stringBuilder7 = strBuilder6.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "1");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test335");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str7 = strBuilder4.midString(10, (int) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test336");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        java.lang.StringBuffer stringBuffer6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.append(stringBuffer6);
        java.lang.String str8 = strBuilder5.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test337");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll(strMatcher5);
        java.lang.String str8 = strBuilder0.leftString(32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test338");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        java.lang.StringBuilder stringBuilder4 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendln("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test339");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder0.lastIndexOf("1");
        int int4 = strBuilder0.capacity();
        java.lang.String str6 = strBuilder0.substring((int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.deleteAll("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n" + "'", str6.equals("\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test340");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendSeparator('1', (int) (short) 100);
        int int9 = strBuilder0.capacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test341");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str4 = strBuilder0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test342");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("14\r\n");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test343");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        java.lang.String str6 = strBuilder1.midString((int) (byte) 10, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test344");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.setLength((int) 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder3.appendln((int) (byte) 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test345");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        java.util.stream.IntStream intStream3 = strBuilder2.chars();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.appendSeparator("0.0\r\n", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test346");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((double) 0L);
        java.lang.String str9 = strBuilder0.substring(3, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\r\n" + "'", str9.equals("\r\n"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test347");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append("", 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test348");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        int int6 = strBuilder0.lastIndexOf('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int8 = strBuilder0.lastIndexOf(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test349");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        java.lang.StringBuffer stringBuffer5 = strBuilder0.toStringBuffer();
        int int8 = strBuilder0.lastIndexOf("14\r\n", 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test350");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test351");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst("hi!", "");
        java.lang.StringBuilder stringBuilder5 = strBuilder4.toStringBuilder();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strBuilder4.asTokenizer();
        java.lang.Object obj7 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.appendln(obj7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test352");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder4.getNullText();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder4.lastIndexOf(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.appendNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test353");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.replaceAll('1', '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test354");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        java.lang.StringBuilder stringBuilder4 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendSeparator('1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.deleteCharAt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test355");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.ensureCapacity((-1));
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.deleteFirst(strMatcher3);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.deleteAll("1\r\n");
        int int8 = strBuilder6.lastIndexOf("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test356");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.setLength((int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.trim();
        char[] charArray9 = strBuilder8.toCharArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test357");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.append(0.0f);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test358");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder2.appendSeparator('#', '4');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.minimizeCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test359");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        java.lang.StringBuilder stringBuilder6 = strBuilder5.toStringBuilder();
        int int8 = strBuilder5.lastIndexOf('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder6.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test360");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.reverse();
        int int8 = strBuilder6.capacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test361");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        java.lang.StringBuilder stringBuilder4 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendSeparator('1');
        java.lang.String str8 = strBuilder5.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test362");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.appendNewLine();
        java.lang.String str9 = strBuilder8.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test363");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert(0, 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((long) 2);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int8 = strBuilder6.indexOf(strMatcher7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test364");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNewLineText("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.appendPadding(10, '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test365");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert(0, 100);
        int int7 = strBuilder4.lastIndexOf("0.0\r\n", (int) (byte) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test366");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((double) 0L);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendSeparator("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test367");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln("");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.ensureCapacity((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test368");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        java.lang.String str7 = strBuilder1.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder1.appendln((double) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1" + "'", str7.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test369");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendNull();
        boolean boolean8 = strBuilder6.endsWith("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test370");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        int int6 = strBuilder4.capacity();
        int int9 = strBuilder4.lastIndexOf('1', 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test371");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        int int9 = strBuilder0.lastIndexOf("hi!", (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test372");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        int int4 = strBuilder0.length();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.replaceAll(strMatcher5, "hi!");
        boolean boolean9 = strBuilder0.contains("1#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test373");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder0.lastIndexOf("1");
        int int4 = strBuilder0.capacity();
        java.lang.String str6 = strBuilder0.substring((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert(5, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 5");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n" + "'", str6.equals("\n"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test374");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.String str5 = strBuilder4.getNullText();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.appendSeparator(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test375");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        int int5 = strBuilder1.lastIndexOf(strMatcher4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder1.insert(10, "14\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test376");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.setNewLineText("1\r\n");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strBuilder5.asTokenizer();
        java.lang.Class<?> wildcardClass7 = strTokenizer6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test377");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        int int6 = strBuilder4.capacity();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.insert(2, "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test378");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("1");
        java.lang.String str6 = strBuilder5.toString();
        java.lang.Class<?> wildcardClass7 = strBuilder5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test379");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceAll(strMatcher2, "1#");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder4.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst('\r');
        boolean boolean9 = strBuilder4.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test380");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        int int4 = strBuilder0.length();
        java.lang.String str5 = strBuilder0.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test381");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.deleteAll(strMatcher6);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln((-1.0d));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test382");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray4 = strBuilder0.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(1L);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendln("0.0\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test383");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder0.lastIndexOf("1");
        int int4 = strBuilder0.capacity();
        java.lang.String str6 = strBuilder0.substring((int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.setNullText("1#");
        java.io.Reader reader9 = strBuilder8.asReader();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32 + "'", int4 == 32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\n" + "'", str6.equals("\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test384");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append((float) ' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test385");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray4 = strBuilder0.getChars(charArray3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator('4', (int) '\r');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln('1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test386");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        java.io.Reader reader6 = strBuilder5.asReader();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.insert((int) '1', '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test387");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        java.util.stream.IntStream intStream5 = strBuilder0.codePoints();
        java.lang.String str7 = strBuilder0.leftString((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test388");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        int int5 = strBuilder1.lastIndexOf(strMatcher4);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.deleteAll('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test389");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        java.lang.String str7 = strBuilder0.toString();
        java.lang.StringBuffer stringBuffer8 = strBuilder0.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "14\r\n" + "'", str7.equals("14\r\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "14\r\n");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test390");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.replace(52, (int) (short) 1, "4");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test391");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.appendln((float) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test392");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll(strMatcher5);
        java.lang.String str7 = strBuilder6.build();
        java.lang.String str9 = strBuilder6.leftString((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test393");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.append((double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test394");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        int int3 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendPadding((int) '\r', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test395");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.appendSeparator('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test396");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.append(stringBuilder4, (int) (byte) 1, 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.appendNewLine();
        java.lang.String str9 = strBuilder7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\r\n" + "'", str9.equals("\r\n"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test397");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strBuilder0.asTokenizer();
        int int6 = strBuilder0.lastIndexOf("hi!");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert(2, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test398");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append((float) 0L);
        java.util.stream.IntStream intStream9 = strBuilder6.chars();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test399");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.setNewLineText("1\r\n");
        java.lang.String str6 = strBuilder5.getNewLineText();
        char[] charArray9 = strBuilder5.toCharArray((int) (short) 0, 57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "1\r\n" + "'", str6.equals("1\r\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test400");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) (short) 1);
        int int2 = strBuilder1.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test401");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray4 = strBuilder0.getChars(charArray3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator('4', (int) '\r');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln((float) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test402");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder2.appendSeparator('#', '4');
        int int9 = strBuilder8.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test403");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator("hi!", (int) (byte) 100);
        java.lang.StringBuffer stringBuffer8 = strBuilder0.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "hi!");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test404");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst(strMatcher4);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int7 = strBuilder2.lastIndexOf(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test405");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert(0, 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.appendln((int) (byte) -1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.minimizeCapacity();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.appendln("1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test406");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.appendNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test407");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.setLength((int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.trim();
        boolean boolean9 = strBuilder7.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test408");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll(strMatcher5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder6.insert(1, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test409");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray4 = strBuilder0.getChars(charArray3);
        java.lang.StringBuffer stringBuffer5 = strBuilder0.toStringBuffer();
        int int7 = strBuilder0.indexOf('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test410");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendSeparator('a', 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln(' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.deleteAll("\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test411");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test412");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder5.delete((int) '4', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test413");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        int int6 = strBuilder3.lastIndexOf("\r\n", (int) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder3.lastIndexOf(strMatcher7, (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test414");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.ensureCapacity((int) (byte) 100);
        java.io.Writer writer6 = strBuilder0.asWriter();
        int int8 = strBuilder0.lastIndexOf("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test415");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder0.indexOf(strMatcher3, (int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test416");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln('\r');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.deleteAll("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test417");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendln("4", (int) (byte) 10, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test418");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        java.lang.String str7 = strBuilder0.build();
        int int9 = strBuilder0.lastIndexOf('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test419");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendSeparator('a', (int) ' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder1.insert((int) (short) 0, (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test420");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        int int5 = strBuilder2.lastIndexOf("", 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln(0.0f);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder2.append((float) '#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test421");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        java.lang.StringBuilder stringBuilder4 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendSeparator('1');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.setNewLineText("\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test422");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.trim();
        java.lang.String str8 = strBuilder0.rightString(10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test423");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        java.lang.String str4 = strBuilder3.getNewLineText();
        int int7 = strBuilder3.lastIndexOf("1", (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test424");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray4 = strBuilder0.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(1L);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendSeparator("\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test425");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.deleteCharAt(6);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test426");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        java.lang.StringBuilder stringBuilder4 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendNewLine();
        java.lang.String str6 = strBuilder1.getNullText();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.reverse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test427");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll(strMatcher5);
        int int8 = strBuilder6.lastIndexOf("4");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test428");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNewLineText("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.appendln(1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test429");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        char[] charArray6 = strBuilder5.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.replaceFirst("\n", "14\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test430");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        int int5 = strBuilder2.lastIndexOf("", 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln(0.0f);
        int int8 = strBuilder7.size();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.reverse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test431");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        java.util.Iterator<java.lang.String> strItor8 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendAll(strItor8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test432");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.append((float) (byte) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.setNullText("0.0\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.setNullText("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test433");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendNull();
        char[] charArray5 = strBuilder4.toCharArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test434");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator("hi!", (int) (byte) 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.minimizeCapacity();
        int int9 = strBuilder7.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test435");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replace(strMatcher1, "1\r\n", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append(100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test436");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append(0.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test437");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendln((-1.0f));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test438");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) (byte) 100);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test439");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert(0, 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = strBuilder1.substring((int) (byte) 100, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test440");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.append((int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test441");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder3.replaceAll(strMatcher6, "1\r\n");
        java.lang.StringBuilder stringBuilder9 = strBuilder8.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "\r\n");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test442");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.minimizeCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test443");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceAll(strMatcher2, "1#");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder4.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.append("\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln((double) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test444");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst("hi!", "");
        java.lang.StringBuilder stringBuilder5 = strBuilder4.toStringBuilder();
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strBuilder4.asTokenizer();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.appendln('\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test445");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test446");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.append(0.0f);
        java.lang.StringBuilder stringBuilder8 = strBuilder7.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "110.0");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test447");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.insert((int) (short) 0, '4');
        java.lang.String str8 = strBuilder0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test448");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.deleteAll('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "14");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test449");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.setNewLineText("1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test450");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((int) (byte) 0);
        boolean boolean7 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.minimizeCapacity();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test451");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        char[] charArray3 = new char[] { 'a', '#' };
        char[] charArray4 = strBuilder0.getChars(charArray3);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append((int) (byte) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendln(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test452");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.deleteAll(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test453");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder0.lastIndexOf("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendSeparator('1', (int) (byte) 1);
        int int8 = strBuilder6.lastIndexOf("\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test454");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendSeparator('a', 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln(' ');
        // The following exception was thrown during execution in test generation
        try {
            char char9 = strBuilder7.charAt(57);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test455");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder5.appendSeparator("", 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test456");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.replaceFirst(' ', '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder5.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test457");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        boolean boolean7 = strBuilder5.contains(strMatcher6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test458");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.deleteAll(strMatcher6);
        int int8 = strBuilder5.size();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test459");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        java.lang.String str7 = strBuilder0.toString();
        java.lang.String str8 = strBuilder0.getNewLineText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "14\r\n" + "'", str7.equals("14\r\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test460");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceAll(strMatcher2, "1#");
        boolean boolean6 = strBuilder4.startsWith("1\r\n");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.deleteAll('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test461");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        int int8 = strBuilder0.indexOf("");
        java.lang.StringBuilder stringBuilder9 = strBuilder0.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder9.toString(), "");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test462");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        char[] charArray6 = strBuilder5.toCharArray();
        char char8 = strBuilder5.charAt(2);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder5.appendNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test463");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        boolean boolean7 = strBuilder1.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test464");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        int int5 = strBuilder3.lastIndexOf(strMatcher4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test465");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.append((long) 57);
        java.lang.String str7 = strBuilder0.rightString(5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "157" + "'", str7.equals("157"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test466");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int8 = strBuilder5.lastIndexOf(strMatcher6, 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test467");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        java.lang.String str7 = strBuilder5.rightString((int) '4');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        int int9 = strBuilder5.lastIndexOf(strMatcher8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "\r\n" + "'", str7.equals("\r\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test468");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.Object[] objArray4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert((int) (byte) -1, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test469");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder0.lastIndexOf("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replaceAll(' ', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test470");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        int int5 = strBuilder1.lastIndexOf(strMatcher4);
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.deleteAll(strMatcher6);
        java.io.Reader reader8 = strBuilder7.asReader();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test471");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        java.lang.String str6 = strBuilder0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test472");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst(strMatcher4);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1" + "'", str3.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test473");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test474");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll(strMatcher5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test475");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.deleteAll("0.0\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test476");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        java.lang.String str4 = strBuilder1.substring((int) (byte) 0, (int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("4", "4");
        java.io.Reader reader8 = strBuilder7.asReader();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\r\n" + "'", str4.equals("\r\n"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test477");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(3);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.append((float) ' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.replaceFirst(strMatcher4, "\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test478");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst("hi!", "");
        java.lang.StringBuilder stringBuilder5 = strBuilder4.toStringBuilder();
        int int7 = strBuilder4.indexOf('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test479");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst("1", "");
        org.apache.commons.lang3.text.StrTokenizer strTokenizer6 = strBuilder0.asTokenizer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strTokenizer6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test480");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1\r\n");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceAll(strMatcher2, "1#");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder4.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst('\r');
        java.lang.String str8 = strBuilder7.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "\n1" + "'", str8.equals("\n1"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test481");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendFixedWidthPadRight(0, 0, 'a');
        char[] charArray9 = strBuilder8.toCharArray();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test482");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.deleteFirst("1#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test483");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert(0, 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.append((long) 2);
        java.lang.StringBuilder stringBuilder7 = strBuilder6.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder7.toString(), "100\r\n2");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test484");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendSeparator('a', 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.appendNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test485");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder3.clear();
        java.lang.String str5 = strBuilder4.getNewLineText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test486");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.append(false);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.appendSeparator('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test487");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.setNewLineText("1\r\n");
        java.lang.StringBuffer stringBuffer6 = strBuilder0.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer6.toString(), "1");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test488");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((float) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.deleteCharAt((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test489");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        char[] charArray7 = new char[] { '#' };
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.appendln(charArray7);
        int int9 = strBuilder4.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(writer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test490");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        java.lang.String str5 = strBuilder3.leftString((int) '4');
        int int6 = strBuilder3.length();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("14\r\n", "14\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1" + "'", str5.equals("1"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test491");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.replaceFirst('#', '#');
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test492");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        java.lang.String str4 = strBuilder1.getNullText();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.deleteAll("1");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test493");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        int int5 = strBuilder1.lastIndexOf(strMatcher4);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendNull();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = strBuilder1.substring((int) (short) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test494");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.trim();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.CharSequence charSequence9 = strBuilder0.subSequence((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test495");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder6.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test496");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 1);
        java.lang.StringBuilder stringBuilder4 = strBuilder3.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "hi!1.0\r\n");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test497");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.append((long) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.replaceFirst('4', 'a');
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test498");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        boolean boolean4 = strBuilder0.isEmpty();
        java.lang.StringBuffer stringBuffer5 = strBuilder0.toStringBuffer();
        org.apache.commons.lang3.text.StrMatcher strMatcher6 = null;
        int int8 = strBuilder0.indexOf(strMatcher6, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test499");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) '1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.replace((-1), (int) (byte) 100, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test500");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.append((long) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.replaceFirst('4', 'a');
        int int9 = strBuilder7.indexOf("1\r\n");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }
}

