package StrBuilder;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class StrBuilder0 {

    public static boolean debug = false;

    @Test
    public void StrBuilder001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder001");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        // The following exception was thrown during execution in StrBuilder generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.deleteCharAt(100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder002");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        // The following exception was thrown during execution in StrBuilder generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.insert(1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder003");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        char[] charArray3 = new char[] { 'a', ' ' };
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder004");
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
    public void StrBuilder005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder005");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder006");
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
    public void StrBuilder007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder007");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder008");
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
    public void StrBuilder009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder009");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder010");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder011");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray6 = new char[] { ' ' };
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder012");
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
    public void StrBuilder013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder013");
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
    public void StrBuilder014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder014");
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
    public void StrBuilder015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder015");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder016");
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
    public void StrBuilder017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder017");
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
    public void StrBuilder018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder018");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder019");
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
    public void StrBuilder020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder020");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder021");
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
    public void StrBuilder022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder022");
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
    public void StrBuilder023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder023");
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
    public void StrBuilder024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder024");
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
    public void StrBuilder025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder025");
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
    public void StrBuilder026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder026");
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
    public void StrBuilder027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder027");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder028");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        java.lang.StringBuilder stringBuilder4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.appendln(stringBuilder4);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder029");
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
    public void StrBuilder030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder030");
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
    public void StrBuilder031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder031");
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
    public void StrBuilder032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder032");
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
    public void StrBuilder033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder033");
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
    public void StrBuilder034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder034");
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
    public void StrBuilder035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder035");
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
    public void StrBuilder036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder036");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln((double) 1L);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder037");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        boolean boolean2 = strBuilder1.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StrBuilder038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder038");
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
    public void StrBuilder039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder039");
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
    public void StrBuilder040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder040");
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
    public void StrBuilder041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder041");
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
    public void StrBuilder042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder042");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder043");
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
    public void StrBuilder044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder044");
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
    public void StrBuilder045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder045");
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
    public void StrBuilder046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder046");
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
    public void StrBuilder047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder047");
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
    public void StrBuilder048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder048");
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
    public void StrBuilder049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder049");
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
    public void StrBuilder050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder050");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder051");
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
    public void StrBuilder052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder052");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.setNullText("hi!");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder053");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder054");
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
    public void StrBuilder055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder055");
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
    public void StrBuilder056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder056");
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
    public void StrBuilder057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder057");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder058");
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
    public void StrBuilder059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder059");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        java.lang.String str7 = strBuilder1.build();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder060");
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
    public void StrBuilder061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder061");
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
    public void StrBuilder062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder062");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.ensureCapacity((-1));
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder063");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder064");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String str4 = strBuilder0.toString();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder065");
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
    public void StrBuilder066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder066");
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
    public void StrBuilder067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder067");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder068");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder069");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendSeparator("1", "1\r\n");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder070");
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
    public void StrBuilder071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder071");
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
    public void StrBuilder072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder072");
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
    public void StrBuilder073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder073");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuilder stringBuilder5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln(stringBuilder5);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder074");
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
    public void StrBuilder075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder075");
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
    public void StrBuilder076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder076");
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
    public void StrBuilder077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder077");
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
    public void StrBuilder078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder078");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        char[] charArray7 = new char[] { '4' };
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder079");
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
    public void StrBuilder080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder080");
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
    public void StrBuilder081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder081");
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
    public void StrBuilder082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder082");
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
    public void StrBuilder083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder083");
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
    public void StrBuilder084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder084");
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
    public void StrBuilder085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder085");
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
    public void StrBuilder086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder086");
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
    public void StrBuilder087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder087");
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
    public void StrBuilder088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder088");
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
    public void StrBuilder089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder089");
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
    public void StrBuilder090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder090");
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
    public void StrBuilder091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder091");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder092");
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
    public void StrBuilder093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder093");
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
    public void StrBuilder094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder094");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        java.lang.String str2 = strBuilder1.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrBuilder095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder095");
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
    public void StrBuilder096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder096");
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
    public void StrBuilder097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder097");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder2.appendFixedWidthPadLeft((int) (short) -1, (int) ' ', '#');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder098");
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
    public void StrBuilder099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder099");
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
    public void StrBuilder100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder100");
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
    public void StrBuilder101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder101");
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
    public void StrBuilder102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder102");
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
    public void StrBuilder103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder103");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder104");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.ensureCapacity((int) (byte) 100);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder105");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder0.indexOf(strMatcher3, (int) (short) 10);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder106");
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
    public void StrBuilder107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder107");
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
    public void StrBuilder108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder108");
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
    public void StrBuilder109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder109");
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
    public void StrBuilder110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder110");
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
    public void StrBuilder111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder111");
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
    public void StrBuilder112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder112");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder113");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        java.lang.String[] strArray5 = new java.lang.String[] { "" };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendAll(strArray5);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder114");
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
    public void StrBuilder115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder115");
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
    public void StrBuilder116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder116");
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
    public void StrBuilder117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder117");
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
    public void StrBuilder118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder118");
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
    public void StrBuilder119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder119");
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
    public void StrBuilder120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder120");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder121");
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
    public void StrBuilder122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder122");
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
    public void StrBuilder123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder123");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        // The following exception was thrown during execution in StrBuilder generation
        try {
            java.lang.String str2 = strBuilder0.substring((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder124");
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
    public void StrBuilder125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder125");
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
    public void StrBuilder126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder126");
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
    public void StrBuilder127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder127");
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
    public void StrBuilder128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder128");
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
    public void StrBuilder129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder129");
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
    public void StrBuilder130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder130");
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
    public void StrBuilder131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder131");
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
    public void StrBuilder132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder132");
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
    public void StrBuilder133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder133");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        boolean boolean3 = strBuilder1.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrBuilder134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder134");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 0);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder135");
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
    public void StrBuilder136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder136");
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
    public void StrBuilder137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder137");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.replaceFirst(strMatcher3, "");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder138");
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
    public void StrBuilder139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder139");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendln((int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder140");
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
    public void StrBuilder141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder141");
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
    public void StrBuilder142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder142");
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
    public void StrBuilder143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder143");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.deleteAll('#');
        java.lang.Object obj5 = null;
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder144");
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
    public void StrBuilder145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder145");
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
    public void StrBuilder146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder146");
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
    public void StrBuilder147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder147");
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
    public void StrBuilder148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder148");
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
    public void StrBuilder149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder149");
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
    public void StrBuilder150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder150");
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
    public void StrBuilder151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder151");
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
    public void StrBuilder152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder152");
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
    public void StrBuilder153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder153");
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
    public void StrBuilder154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder154");
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
    public void StrBuilder155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder155");
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
    public void StrBuilder156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder156");
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
    public void StrBuilder157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder157");
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
    public void StrBuilder158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder158");
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
    public void StrBuilder159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder159");
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
    public void StrBuilder160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder160");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.io.Writer writer5 = strBuilder4.asWriter();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder161");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        // The following exception was thrown during execution in StrBuilder generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder162");
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
    public void StrBuilder163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder163");
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
    public void StrBuilder164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder164");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) (byte) -1);
        // The following exception was thrown during execution in StrBuilder generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder165");
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
    public void StrBuilder166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder166");
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
    public void StrBuilder167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder167");
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
    public void StrBuilder168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder168");
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
    public void StrBuilder169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder169");
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
    public void StrBuilder170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder170");
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
    public void StrBuilder171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder171");
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
    public void StrBuilder172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder172");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.deleteFirst("hi!");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder173");
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
    public void StrBuilder174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder174");
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
    public void StrBuilder175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder175");
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
    public void StrBuilder176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder176");
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
    public void StrBuilder177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder177");
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
    public void StrBuilder178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder178");
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
    public void StrBuilder179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder179");
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
    public void StrBuilder180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder180");
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
    public void StrBuilder181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder181");
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
    public void StrBuilder182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder182");
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
    public void StrBuilder183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder183");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        int int4 = strBuilder1.indexOf(strMatcher2, (int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StrBuilder184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder184");
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
    public void StrBuilder185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder185");
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
    public void StrBuilder186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder186");
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
    public void StrBuilder187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder187");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        java.lang.String str3 = strBuilder2.build();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder188");
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
    public void StrBuilder189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder189");
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
    public void StrBuilder190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder190");
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
    public void StrBuilder191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder191");
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
    public void StrBuilder192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder192");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strBuilder0.asTokenizer();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = null;
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder193");
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
    public void StrBuilder194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder194");
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
    public void StrBuilder195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder195");
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
    public void StrBuilder196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder196");
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
    public void StrBuilder197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder197");
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
    public void StrBuilder198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder198");
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
    public void StrBuilder199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder199");
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
    public void StrBuilder200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder200");
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
    public void StrBuilder201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder201");
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
    public void StrBuilder202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder202");
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
    public void StrBuilder203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder203");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder204");
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
    public void StrBuilder205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder205");
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
    public void StrBuilder206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder206");
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
    public void StrBuilder207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder207");
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
    public void StrBuilder208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder208");
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
    public void StrBuilder209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder209");
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
    public void StrBuilder210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder210");
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
    public void StrBuilder211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder211");
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
    public void StrBuilder212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder212");
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
    public void StrBuilder213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder213");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        // The following exception was thrown during execution in StrBuilder generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (byte) 100, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder214");
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
    public void StrBuilder215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder215");
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
    public void StrBuilder216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder216");
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
    public void StrBuilder217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder217");
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
    public void StrBuilder218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder218");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        int int5 = strBuilder2.lastIndexOf("", 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder2.appendln(0.0f);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder219");
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
    public void StrBuilder220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder220");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.Object[] objArray4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder221");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append("");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.appendPadding((int) '4', 'a');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder222");
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
    public void StrBuilder223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder223");
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
    public void StrBuilder224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder224");
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
    public void StrBuilder225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder225");
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
    public void StrBuilder226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder226");
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
    public void StrBuilder227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder227");
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
    public void StrBuilder228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder228");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        int int6 = strBuilder1.indexOf("1\r\n", (int) '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrBuilder229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder229");
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
    public void StrBuilder230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder230");
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
    public void StrBuilder231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder231");
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
    public void StrBuilder232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder232");
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
    public void StrBuilder233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder233");
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
    public void StrBuilder234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder234");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 0);
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.replaceAll(strMatcher4, "hi!");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder235");
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
    public void StrBuilder236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder236");
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
    public void StrBuilder237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder237");
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
    public void StrBuilder238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder238");
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
    public void StrBuilder239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder239");
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
    public void StrBuilder240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder240");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replaceAll('#', '4');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder241");
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
    public void StrBuilder242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder242");
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
    public void StrBuilder243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder243");
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
    public void StrBuilder244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder244");
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
    public void StrBuilder245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder245");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        // The following exception was thrown during execution in StrBuilder generation
        try {
            java.lang.String str3 = strBuilder1.substring(52);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder246");
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
    public void StrBuilder247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder247");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) '4');
    }

    @Test
    public void StrBuilder248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder248");
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
    public void StrBuilder249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder249");
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
    public void StrBuilder250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder250");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder2.lastIndexOf(strMatcher3, (int) '#');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder251");
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
    public void StrBuilder252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder252");
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
    public void StrBuilder253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder253");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        boolean boolean2 = strBuilder1.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void StrBuilder254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder254");
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
    public void StrBuilder255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder255");
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
    public void StrBuilder256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder256");
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
    public void StrBuilder257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder257");
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
    public void StrBuilder258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder258");
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
    public void StrBuilder259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder259");
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
    public void StrBuilder260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder260");
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
    public void StrBuilder261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder261");
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
    public void StrBuilder262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder262");
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
    public void StrBuilder263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder263");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.ensureCapacity((-1));
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder264");
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
    public void StrBuilder265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder265");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder3.insert(0, 'a');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder266");
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
    public void StrBuilder267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder267");
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
    public void StrBuilder268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder268");
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
    public void StrBuilder269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder269");
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
    public void StrBuilder270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder270");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        java.lang.StringBuffer stringBuffer5 = strBuilder4.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder4.deleteFirst("1");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder271");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.ensureCapacity((int) (byte) 100);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder272");
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
    public void StrBuilder273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder273");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((int) (byte) 0);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder274");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.replaceFirst(strMatcher1, "hi!");
        char[] charArray4 = strBuilder0.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll("\r\n");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder275");
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
    public void StrBuilder276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder276");
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
    public void StrBuilder277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder277");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder2.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder2.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.append((java.lang.Object) strBuilder2);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder278");
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
    public void StrBuilder279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder279");
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
    public void StrBuilder280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder280");
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
    public void StrBuilder281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder281");
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
    public void StrBuilder282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder282");
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
    public void StrBuilder283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder283");
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
    public void StrBuilder284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder284");
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
    public void StrBuilder285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder285");
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
    public void StrBuilder286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder286");
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
    public void StrBuilder287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder287");
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
    public void StrBuilder288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder288");
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
    public void StrBuilder289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder289");
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
    public void StrBuilder290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder290");
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
    public void StrBuilder291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder291");
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
    public void StrBuilder292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder292");
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
    public void StrBuilder293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder293");
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
    public void StrBuilder294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder294");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder295");
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
    public void StrBuilder296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder296");
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
    public void StrBuilder297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder297");
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
    public void StrBuilder298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder298");
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
    public void StrBuilder299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder299");
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
    public void StrBuilder300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder300");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder3.clear();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder301");
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
    public void StrBuilder302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder302");
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
    public void StrBuilder303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder303");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrMatcher strMatcher1 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.replace(strMatcher1, "1\r\n", (int) (byte) 0, (int) (byte) 10, (int) (short) 1);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder304");
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
    public void StrBuilder305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder305");
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
    public void StrBuilder306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder306");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        java.lang.String str2 = strBuilder0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrBuilder307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder307");
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
    public void StrBuilder308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder308");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        int int3 = strBuilder1.lastIndexOf('a');
        java.util.stream.IntStream intStream4 = strBuilder1.codePoints();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(intStream4);
    }

    @Test
    public void StrBuilder309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder309");
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
    public void StrBuilder310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder310");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) (byte) 10);
        java.lang.StringBuilder stringBuilder2 = strBuilder1.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder2.toString(), "");
    }

    @Test
    public void StrBuilder311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder311");
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
    public void StrBuilder312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder312");
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
    public void StrBuilder313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder313");
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
    public void StrBuilder314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder314");
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
    public void StrBuilder315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder315");
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
    public void StrBuilder316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder316");
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
    public void StrBuilder317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder317");
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
    public void StrBuilder318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder318");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.append((long) 57);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder319");
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
    public void StrBuilder320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder320");
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
    public void StrBuilder321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder321");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        java.lang.String str2 = strBuilder1.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void StrBuilder322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder322");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder323");
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
    public void StrBuilder324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder324");
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
    public void StrBuilder325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder325");
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
    public void StrBuilder326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder326");
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
    public void StrBuilder327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder327");
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
    public void StrBuilder328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder328");
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
    public void StrBuilder329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder329");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1\r\n");
        char[] charArray3 = null;
        // The following exception was thrown during execution in StrBuilder generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (short) 10, charArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder330");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.appendln((double) (short) 1);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder331");
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
    public void StrBuilder332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder332");
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
    public void StrBuilder333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder333");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1#");
    }

    @Test
    public void StrBuilder334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder334");
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
    public void StrBuilder335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder335");
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
    public void StrBuilder336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder336");
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
    public void StrBuilder337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder337");
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
    public void StrBuilder338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder338");
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
    public void StrBuilder339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder339");
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
    public void StrBuilder340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder340");
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
    public void StrBuilder341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder341");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str4 = strBuilder0.getNullText();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void StrBuilder342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder342");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("14\r\n");
    }

    @Test
    public void StrBuilder343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder343");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        java.lang.String str6 = strBuilder1.midString((int) (byte) 10, 5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void StrBuilder344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder344");
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
    public void StrBuilder345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder345");
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
    public void StrBuilder346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder346");
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
    public void StrBuilder347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder347");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder348");
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
    public void StrBuilder349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder349");
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
    public void StrBuilder350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder350");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(32);
    }

    @Test
    public void StrBuilder351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder351");
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
    public void StrBuilder352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder352");
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
    public void StrBuilder353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder353");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((-1));
        boolean boolean3 = strBuilder1.contains("1");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.replaceAll('1', '1');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder354");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        int int3 = strBuilder1.lastIndexOf('4');
        java.lang.StringBuilder stringBuilder4 = strBuilder1.toStringBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendSeparator('1');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder355");
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
    public void StrBuilder356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder356");
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
    public void StrBuilder357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder357");
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
    public void StrBuilder358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder358");
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
    public void StrBuilder359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder359");
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
    public void StrBuilder360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder360");
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
    public void StrBuilder361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder361");
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
    public void StrBuilder362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder362");
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
    public void StrBuilder363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder363");
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
    public void StrBuilder364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder364");
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
    public void StrBuilder365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder365");
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
    public void StrBuilder366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder366");
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
    public void StrBuilder367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder367");
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
    public void StrBuilder368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder368");
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
    public void StrBuilder369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder369");
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
    public void StrBuilder370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder370");
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
    public void StrBuilder371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder371");
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
    public void StrBuilder372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder372");
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
    public void StrBuilder373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder373");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder0.lastIndexOf("1");
        int int4 = strBuilder0.capacity();
        java.lang.String str6 = strBuilder0.substring((int) (short) 1);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder374");
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
    public void StrBuilder375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder375");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        int int5 = strBuilder1.lastIndexOf(strMatcher4);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder376");
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
    public void StrBuilder377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder377");
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
    public void StrBuilder378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder378");
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
    public void StrBuilder379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder379");
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
    public void StrBuilder380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder380");
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
    public void StrBuilder381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder381");
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
    public void StrBuilder382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder382");
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
    public void StrBuilder383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder383");
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
    public void StrBuilder384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder384");
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
    public void StrBuilder385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder385");
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
    public void StrBuilder386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder386");
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
    public void StrBuilder387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder387");
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
    public void StrBuilder388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder388");
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
    public void StrBuilder389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder389");
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
    public void StrBuilder390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder390");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("1");
        // The following exception was thrown during execution in StrBuilder generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.replace(52, (int) (short) 1, "4");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder391");
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
    public void StrBuilder392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder392");
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
    public void StrBuilder393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder393");
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
    public void StrBuilder394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder394");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder("");
        int int3 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendPadding((int) '\r', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder395");
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
    public void StrBuilder396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder396");
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
    public void StrBuilder397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder397");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.indexOf("hi!", 0);
        org.apache.commons.lang3.text.StrTokenizer strTokenizer4 = strBuilder0.asTokenizer();
        int int6 = strBuilder0.lastIndexOf("hi!");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder398");
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
    public void StrBuilder399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder399");
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
    public void StrBuilder400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder400");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) (short) 1);
        int int2 = strBuilder1.size();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void StrBuilder401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder401");
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
    public void StrBuilder402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder402");
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
    public void StrBuilder403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder403");
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
    public void StrBuilder404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder404");
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
    public void StrBuilder405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder405");
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
    public void StrBuilder406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder406");
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
    public void StrBuilder407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder407");
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
    public void StrBuilder408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder408");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        boolean boolean2 = strBuilder0.contains('#');
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.minimizeCapacity();
        boolean boolean4 = strBuilder0.isEmpty();
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.deleteAll(strMatcher5);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder409");
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
    public void StrBuilder410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder410");
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
    public void StrBuilder411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder411");
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
    public void StrBuilder412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder412");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder0.appendNull();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.deleteFirst("1");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder413");
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
    public void StrBuilder414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder414");
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
    public void StrBuilder415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder415");
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
    public void StrBuilder416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder416");
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
    public void StrBuilder417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder417");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder418");
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
    public void StrBuilder419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder419");
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
    public void StrBuilder420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder420");
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
    public void StrBuilder421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder421");
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
    public void StrBuilder422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder422");
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
    public void StrBuilder423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder423");
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
    public void StrBuilder424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder424");
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
    public void StrBuilder425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder425");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln("hi!", (int) (byte) 1, (int) (short) 0);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder426");
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
    public void StrBuilder427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder427");
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
    public void StrBuilder428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder428");
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
    public void StrBuilder429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder429");
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
    public void StrBuilder430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder430");
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
    public void StrBuilder431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder431");
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
    public void StrBuilder432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder432");
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
    public void StrBuilder433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder433");
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
    public void StrBuilder434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder434");
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
    public void StrBuilder435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder435");
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
    public void StrBuilder436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder436");
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
    public void StrBuilder437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder437");
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
    public void StrBuilder438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder438");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) (byte) 100);
    }

    @Test
    public void StrBuilder439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder439");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert(0, 100);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder440");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.append((int) '\r');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder441");
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
    public void StrBuilder442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder442");
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
    public void StrBuilder443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder443");
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
    public void StrBuilder444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder444");
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
    public void StrBuilder445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder445");
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
    public void StrBuilder446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder446");
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
    public void StrBuilder447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder447");
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
    public void StrBuilder448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder448");
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
    public void StrBuilder449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder449");
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
    public void StrBuilder450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder450");
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
    public void StrBuilder451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder451");
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
    public void StrBuilder452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder452");
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
    public void StrBuilder453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder453");
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
    public void StrBuilder454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder454");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(100);
        java.util.stream.IntStream intStream2 = strBuilder1.codePoints();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.appendSeparator('a', 3);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder5.appendln(' ');
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder455");
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
    public void StrBuilder456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder456");
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
    public void StrBuilder457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder457");
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
    public void StrBuilder458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder458");
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
    public void StrBuilder459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder459");
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
    public void StrBuilder460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder460");
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
    public void StrBuilder461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder461");
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
    public void StrBuilder462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder462");
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
    public void StrBuilder463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder463");
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
    public void StrBuilder464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder464");
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
    public void StrBuilder465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder465");
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
    public void StrBuilder466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder466");
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
    public void StrBuilder467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder467");
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
    public void StrBuilder468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder468");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.Object[] objArray4 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "");
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder469");
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
    public void StrBuilder470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder470");
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
    public void StrBuilder471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder471");
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
    public void StrBuilder472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder472");
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
    public void StrBuilder473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder473");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
    }

    @Test
    public void StrBuilder474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder474");
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
    public void StrBuilder475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder475");
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
    public void StrBuilder476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder476");
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
    public void StrBuilder477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder477");
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
    public void StrBuilder478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder478");
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
    public void StrBuilder479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder479");
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
    public void StrBuilder480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder480");
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
    public void StrBuilder481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder481");
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
    public void StrBuilder482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder482");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.deleteFirst("1#");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder483");
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
    public void StrBuilder484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder484");
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
    public void StrBuilder485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder485");
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
    public void StrBuilder486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder486");
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
    public void StrBuilder487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder487");
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
    public void StrBuilder488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder488");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((java.lang.Object) (short) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator('4');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendln((float) 0);
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder489");
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
    public void StrBuilder490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder490");
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
    public void StrBuilder491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder491");
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
    public void StrBuilder492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder492");
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
    public void StrBuilder493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder493");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = strBuilder0.appendNewLine();
        int int3 = strBuilder1.lastIndexOf('#');
        org.apache.commons.lang3.text.StrMatcher strMatcher4 = null;
        int int5 = strBuilder1.lastIndexOf(strMatcher4);
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendNull();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder494");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf("hi!", (int) 'a');
        java.lang.String str5 = strBuilder0.leftString((-1));
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.trim();
        // The following exception was thrown during execution in StrBuilder generation
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
    public void StrBuilder495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder495");
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
    public void StrBuilder496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder496");
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
    public void StrBuilder497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder497");
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
    public void StrBuilder498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder498");
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
    public void StrBuilder499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder499");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder((int) '1');
        // The following exception was thrown during execution in StrBuilder generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder1.replace((-1), (int) (byte) 100, "\r\n");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.StrBuilder500");
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

