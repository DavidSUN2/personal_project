
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
            System.out.format("%n%s%n", "StrBuilder0.test01");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray9 = strBuilder0.toCharArray((int) ' ', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test02");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder6.append("hi!");
        java.io.Reader reader9 = strBuilder6.asReader();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(reader9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test03");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        java.lang.Class<?> wildcardClass8 = strBuilder0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test04");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendln((java.lang.Object) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.appendNull();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
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
            System.out.format("%n%s%n", "StrBuilder0.test05");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        java.lang.String str9 = strBuilder7.leftString((int) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test06");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = strBuilder0.substring((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test07");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
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
            System.out.format("%n%s%n", "StrBuilder0.test08");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        java.lang.StringBuilder stringBuilder8 = strBuilder7.toStringBuilder();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuilder8.toString(), "-1hi!falsehi!0");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test09");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        java.lang.String str8 = strBuilder7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "-1hi!falsehi!0" + "'", str8.equals("-1hi!falsehi!0"));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test10");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.insert(0, 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test11");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            char char4 = strBuilder0.charAt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test12");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.appendln((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
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
            System.out.format("%n%s%n", "StrBuilder0.test13");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        int int8 = strBuilder0.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 14 + "'", int8 == 14);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test14");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.appendln("-1hi!falsehi!0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
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
            System.out.format("%n%s%n", "StrBuilder0.test15");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.minimizeCapacity();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder8.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
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
            System.out.format("%n%s%n", "StrBuilder0.test16");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int1 = strBuilder0.size();
        int int4 = strBuilder0.lastIndexOf('a', (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test17");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.append((-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test18");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.insert((int) (short) 1, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test19");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder0.trim();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test20");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        boolean boolean6 = strBuilder4.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test21");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder4.insert((int) (byte) 100, "-1hi!falsehi!0");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test22");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        int int9 = strBuilder4.lastIndexOf("hi!", (int) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test23");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        org.apache.commons.lang3.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder6.indexOf(strMatcher7, 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test24");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        char[] charArray5 = strBuilder0.toCharArray();
        int int8 = strBuilder0.indexOf(' ', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test25");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test26");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder7.appendNewLine();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test27");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        int int5 = strBuilder0.indexOf('4', 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendSeparator('#', (int) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test28");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append(10.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
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
            System.out.format("%n%s%n", "StrBuilder0.test29");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.insert((int) (byte) 100, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test30");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int1 = strBuilder0.size();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.replaceAll(strMatcher2, "-1hi!falsehi!0");
        java.lang.String str7 = strBuilder0.midString(0, 14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test31");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        java.lang.String str5 = strBuilder0.substring((int) (short) 0, 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln(false);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder7.append((java.lang.Object) (byte) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test32");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        int int5 = strBuilder0.indexOf('4', 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (byte) 1);
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        int int9 = strBuilder7.lastIndexOf(strMatcher8);
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
            System.out.format("%n%s%n", "StrBuilder0.test33");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder0.appendln((java.lang.Object) 1);
        boolean boolean9 = strBuilder8.isEmpty();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test34");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (short) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test35");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        int int5 = strBuilder0.indexOf('4', 0);
        java.lang.String str7 = strBuilder0.rightString((int) (byte) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test36");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder1.append((float) 1);
        char[] charArray4 = new char[] {};
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.append(charArray4, 14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test37");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        java.lang.String str7 = strBuilder6.build();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test38");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        int int5 = strBuilder0.indexOf('4', 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (byte) 1);
        char[] charArray8 = new char[] {};
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.appendln(charArray8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
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
            System.out.format("%n%s%n", "StrBuilder0.test39");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        java.lang.String str3 = strBuilder1.rightString((int) (short) 0);
        int int6 = strBuilder1.indexOf("-1hi!falsehi!0", 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder1.insert(10, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test40");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        java.lang.String str3 = strBuilder1.rightString((int) (short) 0);
        int int6 = strBuilder1.indexOf("-1hi!falsehi!0", 100);
        java.lang.StringBuffer stringBuffer7 = strBuilder1.toStringBuffer();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "");
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test41");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int1 = strBuilder0.size();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.replaceAll(strMatcher2, "-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.setNullText("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test42");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.replaceFirst("-1hi!falsehi!0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test43");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int1 = strBuilder0.size();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.replaceAll(strMatcher2, "-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        boolean boolean6 = strBuilder4.contains(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.appendSeparator('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test44");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        java.lang.String str3 = strBuilder1.rightString((int) (short) 0);
        int int6 = strBuilder1.indexOf("-1hi!falsehi!0", 100);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder1.deleteAll("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test45");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        java.lang.String str5 = strBuilder0.substring((int) (short) 0, 0);
        int int8 = strBuilder0.lastIndexOf("-1hi!falsehi!0", (int) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test46");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        java.lang.String str2 = strBuilder1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test47");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        int int5 = strBuilder0.indexOf('4', 0);
        int int6 = strBuilder0.length();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test48");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder3 = strBuilder2.reverse();
        org.apache.commons.lang3.text.StrBuilder strBuilder5 = strBuilder3.append('#');
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
            System.out.format("%n%s%n", "StrBuilder0.test49");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        java.lang.StringBuffer stringBuffer8 = strBuilder0.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.clear();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "-1hi!falsehi!0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test50");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int3 = strBuilder0.lastIndexOf('4', 100);
        boolean boolean5 = strBuilder0.startsWith("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test51");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        int int5 = strBuilder0.indexOf('4', 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.deleteAll(' ');
        org.apache.commons.lang3.text.StrMatcher strMatcher8 = null;
        int int9 = strBuilder7.indexOf(strMatcher8);
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
            System.out.format("%n%s%n", "StrBuilder0.test52");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder4.deleteAll(strMatcher5);
        org.apache.commons.lang3.text.StrBuilder strBuilder8 = strBuilder4.setLength(0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
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
            System.out.format("%n%s%n", "StrBuilder0.test53");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        org.apache.commons.lang3.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.deleteFirst(strMatcher3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test54");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        boolean boolean3 = strBuilder1.startsWith("-1hi!falsehi!0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test55");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.Object[] objArray4 = new java.lang.Object[] { (short) -1, false, 0L };
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder0.appendWithSeparators(objArray4, "hi!");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.trim();
        java.lang.StringBuffer stringBuffer8 = strBuilder0.toStringBuffer();
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.reverse();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(objArray4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(stringBuffer8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "-1hi!falsehi!0");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test56");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst('4', ' ');
        org.apache.commons.lang3.text.StrBuilder strBuilder6 = strBuilder1.appendln("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test57");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        org.apache.commons.lang3.text.StrBuilder strBuilder2 = strBuilder0.append((long) 10);
        int int5 = strBuilder0.indexOf('4', 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((double) (byte) 1);
        org.apache.commons.lang3.text.StrBuilder strBuilder9 = strBuilder0.deleteAll(' ');
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
            System.out.format("%n%s%n", "StrBuilder0.test58");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        int int1 = strBuilder0.size();
        org.apache.commons.lang3.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.replaceAll(strMatcher2, "-1hi!falsehi!0");
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendSeparator("-1hi!falsehi!0", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test59");
        org.apache.commons.lang3.text.StrBuilder strBuilder1 = new org.apache.commons.lang3.text.StrBuilder(1);
        int int4 = strBuilder1.indexOf("-1hi!falsehi!0", 0);
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder1.replaceAll('4', 'a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void StrBuilder() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "StrBuilder0.test60");
        org.apache.commons.lang3.text.StrBuilder strBuilder0 = new org.apache.commons.lang3.text.StrBuilder();
        java.lang.String str2 = strBuilder0.rightString((int) (short) 10);
        org.apache.commons.lang3.text.StrBuilder strBuilder4 = strBuilder0.appendSeparator("-1hi!falsehi!0");
        char[] charArray5 = strBuilder0.toCharArray();
        org.apache.commons.lang3.text.StrBuilder strBuilder7 = strBuilder0.appendln((long) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strBuilder7);
    }
}

