
package CharSet;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CharSet0 {

    public static boolean debug = false;

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test01");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test02");
        java.lang.String[] strArray0 = null;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.getInstance(strArray0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(charSet1);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test03");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        java.lang.Class<?> wildcardClass1 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test04");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet1.toString();
        boolean boolean5 = charSet1.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test05");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        java.lang.String str1 = charSet0.toString();
        java.lang.Class<?> wildcardClass2 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test06");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test07");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        java.lang.Class<?> wildcardClass1 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test08");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 100);
        boolean boolean5 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass6 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test09");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9]", "[a-z]", "[a-z]", "[0-9]", "[]", "[]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.String str8 = charSet7.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[0-9, a-z, [, ]]" + "'", str8.equals("[0-9, a-z, [, ]]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test10");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9]", "[a-z]", "[a-z]", "[0-9]", "[]", "[]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test11");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9]", "[a-z]", "[a-z]", "[0-9]", "[]", "[]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        org.apache.commons.lang3.CharSet charSet8 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        org.apache.commons.lang3.CharSet charSet9 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet9);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test12");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 100);
        boolean boolean5 = charSet0.contains(' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test13");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        java.lang.String str4 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z, A-Z]" + "'", str4.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test14");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.EMPTY;
        java.lang.String str2 = charSet1.toString();
        boolean boolean4 = charSet1.equals((java.lang.Object) (short) 1);
        boolean boolean5 = charSet0.equals((java.lang.Object) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test15");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test16");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9]", "[a-z]", "[a-z]", "[0-9]", "[]", "[]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.Class<?> wildcardClass8 = charSet7.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test17");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test18");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = charSet0.equals((java.lang.Object) 100.0d);
        boolean boolean7 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test19");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) (-1L));
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test20");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = charSet0.contains('4');
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test21");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = charSet0.contains('4');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z, A-Z]" + "'", str8.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z, A-Z]" + "'", str9.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test22");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.String str1 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[a-z]" + "'", str1.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test23");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean5 = charSet3.equals((java.lang.Object) charSet4);
        java.lang.String str6 = charSet3.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) str6);
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z, A-Z]" + "'", str6.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test24");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean5 = charSet3.equals((java.lang.Object) charSet4);
        java.lang.String str6 = charSet3.toString();
        boolean boolean7 = charSet0.equals((java.lang.Object) str6);
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z, A-Z]" + "'", str6.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test25");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        java.lang.String str1 = charSet0.toString();
        java.lang.String str2 = charSet0.toString();
        java.lang.Object obj3 = null;
        boolean boolean4 = charSet0.equals(obj3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "[]" + "'", str2.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test26");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = charSet0.contains('a');
        java.lang.Class<?> wildcardClass8 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test27");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.Class<?> wildcardClass1 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test28");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 100);
        java.lang.Class<?> wildcardClass4 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test29");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.Class<?> wildcardClass3 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test30");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = charSet0.equals((java.lang.Object) ' ');
        boolean boolean9 = charSet0.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test31");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        boolean boolean2 = charSet0.contains('a');
        java.lang.String str3 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test32");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 100);
        boolean boolean5 = charSet0.equals((java.lang.Object) (-1));
        java.lang.Object obj6 = null;
        boolean boolean7 = charSet0.equals(obj6);
        boolean boolean9 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test33");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        java.lang.Object obj4 = null;
        boolean boolean5 = charSet3.equals(obj4);
        boolean boolean6 = charSet0.equals((java.lang.Object) boolean5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test34");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.EMPTY;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) (short) 1);
        boolean boolean5 = charSet0.contains(' ');
        boolean boolean7 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[]" + "'", str1.equals("[]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test35");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet1.toString();
        java.lang.String str4 = charSet1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z]" + "'", str4.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test36");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test37");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.Class<?> wildcardClass3 = charSet1.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test38");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) (-1.0d));
        org.apache.commons.lang3.CharSet charSet6 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean7 = charSet0.equals((java.lang.Object) charSet6);
        java.lang.Class<?> wildcardClass8 = charSet6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test39");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.String str1 = charSet0.toString();
        boolean boolean3 = charSet0.equals((java.lang.Object) 100);
        java.lang.String str4 = charSet0.toString();
        boolean boolean6 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "[0-9]" + "'", str1.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[0-9]" + "'", str4.equals("[0-9]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test40");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        boolean boolean2 = charSet0.contains('4');
        java.lang.Class<?> wildcardClass3 = charSet0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test41");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) (-1.0d));
        boolean boolean7 = charSet0.equals((java.lang.Object) ' ');
        java.lang.String str8 = charSet0.toString();
        java.lang.String str9 = charSet0.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "[a-z, A-Z]" + "'", str8.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z, A-Z]" + "'", str9.equals("[a-z, A-Z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test42");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_UPPER;
        boolean boolean2 = charSet0.contains('4');
        boolean boolean4 = charSet0.contains(' ');
        boolean boolean6 = charSet0.equals((java.lang.Object) (short) 100);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test43");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.Class<?> wildcardClass5 = charSet4.getClass();
        boolean boolean6 = charSet1.equals((java.lang.Object) wildcardClass5);
        boolean boolean8 = charSet1.contains('a');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test44");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        boolean boolean4 = charSet0.contains('#');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test45");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet1.toString();
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.ASCII_NUMERIC;
        java.lang.Class<?> wildcardClass5 = charSet4.getClass();
        boolean boolean6 = charSet1.equals((java.lang.Object) wildcardClass5);
        boolean boolean8 = charSet1.contains('4');
        java.lang.String str9 = charSet1.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z]" + "'", str3.equals("[a-z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[a-z]" + "'", str9.equals("[a-z]"));
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test46");
        java.lang.String[] strArray2 = new java.lang.String[] { "[]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        org.apache.commons.lang3.CharSet charSet4 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str5 = charSet4.toString();
        java.lang.Class<?> wildcardClass6 = charSet4.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "[a-z, [, ]]" + "'", str5.equals("[a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test47");
        java.lang.String[] strArray6 = new java.lang.String[] { "[a-z, [, ]]", "[a-z]", "[a-z, [, ]]", "", "[0-9]", "[0-9]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test48");
        java.lang.String[] strArray6 = new java.lang.String[] { "[0-9]", "[a-z]", "[a-z]", "[0-9]", "[]", "[]" };
        org.apache.commons.lang3.CharSet charSet7 = org.apache.commons.lang3.CharSet.getInstance(strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test49");
        org.apache.commons.lang3.CharSet charSet0 = org.apache.commons.lang3.CharSet.ASCII_ALPHA;
        org.apache.commons.lang3.CharSet charSet1 = org.apache.commons.lang3.CharSet.ASCII_ALPHA_LOWER;
        boolean boolean2 = charSet0.equals((java.lang.Object) charSet1);
        java.lang.String str3 = charSet0.toString();
        boolean boolean5 = charSet0.equals((java.lang.Object) (-1.0d));
        java.lang.String str6 = charSet0.toString();
        boolean boolean8 = charSet0.contains('4');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "[a-z, A-Z]" + "'", str3.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "[a-z, A-Z]" + "'", str6.equals("[a-z, A-Z]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void CharSet() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "CharSet0.test50");
        java.lang.String[] strArray2 = new java.lang.String[] { "[]", "[a-z]" };
        org.apache.commons.lang3.CharSet charSet3 = org.apache.commons.lang3.CharSet.getInstance(strArray2);
        java.lang.String str4 = charSet3.toString();
        boolean boolean6 = charSet3.contains('a');
        java.lang.Class<?> wildcardClass7 = charSet3.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(strArray2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(charSet3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "[a-z, [, ]]" + "'", str4.equals("[a-z, [, ]]"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }
}

